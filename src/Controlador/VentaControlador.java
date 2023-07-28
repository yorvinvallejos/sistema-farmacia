package Controlador;

import Bean.ConfiguracionBean;
import Bean.DetalleBean;
import Bean.MedicamentoBean;
import Bean.PacienteBean;
import Bean.VentaBean;
import Modelo.ConfiguracionDAO;
import Modelo.MedicamentoDAO;
import Modelo.PacienteDAO;
import Modelo.VentaDAO;
import Vista.Sistema;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class VentaControlador implements ActionListener, KeyListener {

    PacienteBean paci = new PacienteBean();
    PacienteDAO paDAO = new PacienteDAO();
    MedicamentoDAO MeDAO = new MedicamentoDAO();
    MedicamentoBean medi = new MedicamentoBean();
    ConfiguracionBean confi = new ConfiguracionBean();
    DetalleBean de = new DetalleBean();
    VentaBean ve;
    VentaDAO veDAO;
    ConfiguracionDAO confDAO = new ConfiguracionDAO();
    Sistema vista;
    int item = 0;
    double Totalpagar = 0.00;
    DefaultTableModel modelo = new DefaultTableModel();
    DefaultTableModel tmp = new DefaultTableModel();

    public VentaControlador(VentaBean ve, VentaDAO veDAO, Sistema vista) {
        this.ve = ve;
        this.veDAO = veDAO;
        this.vista = vista;
        this.vista.btnEliminarVenta.addActionListener(this);
        this.vista.btnImprimirVEnta.addActionListener(this);
        this.vista.btnPdfVenta.addActionListener(this);
        this.vista.btnVentas.addActionListener(this);
        this.vista.btnNuevaVenta.addActionListener(this);

        this.vista.txtCodigoVenta.addKeyListener(this);
        this.vista.txtCantidadVenta.addKeyListener(this);
        this.vista.txtDniVenta.addKeyListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.btnEliminarVenta) {
            modelo = (DefaultTableModel) vista.tablaNuevaVenta.getModel();
            modelo.removeRow(vista.tablaNuevaVenta.getSelectedRow());
            TotalPagar();
            vista.txtCodigoMedi.requestFocus();
        }

        if (e.getSource() == vista.btnImprimirVEnta) {
            if (vista.tablaNuevaVenta.getRowCount() > 0) {
                if (!"".equals(vista.txtNombrespacienteVenta.getText())) {
                    RegistrarVenta();
                    RegistrarDetalle();
                    ActualizarStock();
                    pdf();
                    LimpiarTableVenta();
                    LimpiarPacienteventa();
                } else {
                    JOptionPane.showMessageDialog(null, "Debes buscar un cliente");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Noy productos en la venta");
            }
        }
        if (e.getSource() == vista.btnVentas) {
            vista.jTabbedPane1.setSelectedIndex(4);        
            LimpiarTable();
            ListarVentas();
        }
        if (e.getSource() == vista.btnNuevaVenta) {
            vista.jTabbedPane1.setSelectedIndex(0);
        }
        if (e.getSource() == vista.btnPdfVenta) {
            try {
                int id = Integer.parseInt(vista.txtIdventa.getText());
                File file = new File("src/Pdf/venta" + id + ".pdf");
                Desktop.getDesktop().open(file);
            } catch (IOException ex) {
                Logger.getLogger(Sistema.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        vista.tablaVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                int fila = vista.tablaVentas.rowAtPoint(evt.getPoint());
                vista.txtIdventa.setText(vista.tablaVentas.getValueAt(fila, 0).toString());
            }
        });
    }

    //////////////////////////////////////////////////////////////////////////   
    private void RegistrarVenta() {
        String cliente = vista.txtNombrespacienteVenta.getText();
        String vendedor = vista.labelVendedor.getText();
        double monto = Totalpagar;
        ve.setCliente(cliente);
        ve.setVendedor(vendedor);
        ve.setTotal(monto);
        veDAO.RegistrarVenta(ve);
        
    }

    private void RegistrarDetalle() {
        int id = veDAO.IdVenta();
        for (int i = 0; i < vista.tablaNuevaVenta.getRowCount(); i++) {
            int cod = Integer.parseInt(vista.tablaNuevaVenta.getValueAt(i, 0).toString());
            int cant = Integer.parseInt(vista.tablaNuevaVenta.getValueAt(i, 2).toString());
            double precio = Double.parseDouble(vista.tablaNuevaVenta.getValueAt(i, 3).toString());
            de.setCodigo_medicamento(cod);
            de.setCantidad(cant);
            de.setPrecio(precio);
            de.setId(id);
            veDAO.RegistrarDetalle(de);

        }
    }

    private void ActualizarStock() {
        for (int i = 0; i < vista.tablaNuevaVenta.getRowCount(); i++) {
            String cod = vista.tablaNuevaVenta.getValueAt(i, 0).toString();
            int cant = Integer.parseInt(vista.tablaNuevaVenta.getValueAt(i, 2).toString());
            medi = MeDAO.BuscarMedicamento(cod);
            int StockActual = medi.getStock() - cant;
            veDAO.ActualizarStock(StockActual, cod);

        }
    }

    public void ListarVentas() {
        List<VentaBean> ListarVenta = veDAO.Listarventas();
        modelo = (DefaultTableModel) vista.tablaVentas.getModel();
        Object[] ob = new Object[4];
        for (int i = 0; i < ListarVenta.size(); i++) {
            ob[0] = ListarVenta.get(i).getId();
            ob[1] = ListarVenta.get(i).getCliente();
            ob[2] = ListarVenta.get(i).getVendedor();
            ob[3] = ListarVenta.get(i).getTotal();
            modelo.addRow(ob);
        }
        vista.tablaVentas.setModel(modelo);
        JTableHeader header = vista.tablaVentas.getTableHeader();
        header.setOpaque(false);
        header.setBackground(Color.blue);
        header.setForeground(Color.white);

    }

    @Override
    public void keyPressed(KeyEvent ke) {
        if (ke.getSource() == vista.txtCodigoVenta) {
            if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                if (!"".equals(vista.txtCodigoVenta.getText())) {
                    String cod = vista.txtCodigoVenta.getText();
                    medi = MeDAO.BuscarMedicamento(cod);
                    if (medi.getDescripcion() != null) {
                        vista.txtDecripcionVenta.setText("" + medi.getDescripcion());
                        vista.txtPrecioVenta.setText("" + medi.getPrecio());
                        vista.txtStockDisponVenta.setText("" + medi.getStock());
                        vista.txtCantidadVenta.requestFocus();
                    } else {
                        LimparVenta();
                        vista.txtCodigoVenta.requestFocus();
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Ingrese el codigo del Medicamento");
                    vista.txtCodigoVenta.requestFocus();
                }
            }
        }
        if (ke.getSource() == vista.txtDniVenta) {
            if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                if (!"".equals(vista.txtDniVenta.getText())) {
                    int dni = Integer.parseInt(vista.txtDniVenta.getText());
                    paci = paDAO.BuscarPaciente(dni);
                    if (paci.getNombre() != null) {
                        vista.txtNombrespacienteVenta.setText("" + paci.getNombre());
                        vista.txtTelefonopacienteVenta.setText("" + paci.getTelefono());
                        vista.txtDirecciPacienVenta.setText("" + paci.getDireccion());
                        vista.txtSexoPacienteVenta.setText("" + paci.getSexo());
                    } else {
                        vista.txtDniVenta.setText("");
                        JOptionPane.showMessageDialog(null, "El paciente no existe");
                    }
                }
            }
        }
        if (ke.getSource() == vista.txtCantidadVenta) {
            if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                if (!"".equals(vista.txtCantidadVenta.getText())) {
                    String cod = vista.txtCodigoVenta.getText();
                    String descripcion = vista.txtDecripcionVenta.getText();
                    int cant = Integer.parseInt(vista.txtCantidadVenta.getText());
                    double precio = Double.parseDouble(vista.txtPrecioVenta.getText());
                    double total = cant * precio;
                    int stock = Integer.parseInt(vista.txtStockDisponVenta.getText());
                    if (stock >= cant) {

                        item = item + 1;
                        tmp = (DefaultTableModel) vista.tablaNuevaVenta.getModel();
                        for (int i = 0; i < vista.tablaNuevaVenta.getRowCount(); i++) {
                            if (vista.tablaNuevaVenta.getValueAt(i, 1).equals(vista.txtDecripcionVenta.getText())) {
                                JOptionPane.showMessageDialog(null, "El Medicamento ya esta registrado");
                                return;
                            }
                        }
                        ArrayList lista = new ArrayList();
                        lista.add(item);
                        lista.add(cod);
                        lista.add(descripcion);
                        lista.add(cant);
                        lista.add(precio);
                        lista.add(total);
                        Object[] O = new Object[5];
                        O[0] = lista.get(1);
                        O[1] = lista.get(2);
                        O[2] = lista.get(3);
                        O[3] = lista.get(4);
                        O[4] = lista.get(5);
                        tmp.addRow(O);
                        vista.tablaNuevaVenta.setModel(tmp);
                        TotalPagar();
                        LimparVenta();
                        vista.txtCodigoVenta.requestFocus();
                    } else {
                        JOptionPane.showMessageDialog(null, "Stock no disponible");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Ingrese Cantidad");
                }
            }
        }
    }

    @Override
    public void keyTyped(KeyEvent ke) {
    }

    @Override
    public void keyReleased(KeyEvent ke) {
    }

    private void LimparVenta() {
        vista.txtCodigoVenta.setText("");
        vista.txtDecripcionVenta.setText("");
        vista.txtCantidadVenta.setText("");
        vista.txtStockDisponVenta.setText("");
        vista.txtPrecioVenta.setText("");
        vista.txtIdMediVenta.setText("");
    }

    public void TotalPagar() {
        Totalpagar = 0.00;
        int numFila = vista.tablaNuevaVenta.getRowCount();
        for (int i = 0; i < numFila; i++) {
            double cal = Double.parseDouble(String.valueOf(vista.tablaNuevaVenta.getModel().getValueAt(i, 4)));
            Totalpagar = Totalpagar + cal;
        }
        vista.labelTotal.setText(String.format("%.2f", Totalpagar));
    }

    private void LimpiarTableVenta() {
        tmp = (DefaultTableModel) vista.tablaNuevaVenta.getModel();
        int fila = vista.tablaNuevaVenta.getRowCount();
        for (int i = 0; i < fila; i++) {
            tmp.removeRow(0);
        }
    }
    public void LimpiarTable() {
        for (int i = 0; i < modelo.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }
    }

    private void LimpiarPacienteventa() {
        vista.txtDniVenta.setText("");
        vista.txtNombrespacienteVenta.setText("");
        vista.txtTelefonopacienteVenta.setText("");
        vista.txtDirecciPacienVenta.setText("");
        vista.txtSexoPacienteVenta.setText("");
        vista.txtDniVenta.requestFocus();
    }

    public void pdf() {
        try {
            int id = veDAO.IdVenta();
            FileOutputStream archivo;
            File file = new File("src/pdf/venta" + id + ".pdf");
            archivo = new FileOutputStream(file);
            Document doc = new Document();
            PdfWriter.getInstance(doc, archivo);
            doc.open();
            Image img = Image.getInstance("src/Img/logo_pdf.png");

            Paragraph fecha = new Paragraph();
            Font negrita = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.BOLD, BaseColor.BLUE);
            fecha.add(Chunk.NEWLINE);
            Date date = new Date();
            fecha.add("Factura:" + id + "\n" + "Fecha: " + new SimpleDateFormat("dd-mm-yyyy").format(date) + "\n\n");

            PdfPTable Encabezado = new PdfPTable(4);
            Encabezado.setWidthPercentage(100);
            Encabezado.getDefaultCell().setBorder(0);
            float[] ColumnaEncabezado = new float[]{20f, 30f, 70f, 40f};
            Encabezado.setWidths(ColumnaEncabezado);
            Encabezado.setHorizontalAlignment(Element.ALIGN_LEFT);

            Encabezado.addCell(img);

            String ruc = vista.txtRucFarmacia.getText();
            String nom = vista.txtNombreFarmacia.getText();
            String tel = vista.txtTelefonoFarmacia.getText();
            String dir = vista.txtDireccionFarmacia.getText();
            String ra = vista.txtRazonSocialFarmacia.getText();

            Encabezado.addCell("");
            Encabezado.addCell("RUC: " + ruc + "\nNOMBRE: " + nom + "\nTELEFONO: " + tel + "\nDIRECCIÓN: " + dir + "\nRAZÓN: " + ra);
            Encabezado.addCell(fecha);
            doc.add(Encabezado);

            Paragraph paci = new Paragraph();
            paci.add(Chunk.NEWLINE);
            paci.add("Datos de los pacientes" + "\n\n");
            doc.add(paci);
            /////////////////

            PdfPTable tablaPaci = new PdfPTable(4);
            tablaPaci.setWidthPercentage(100);
            tablaPaci.getDefaultCell().setBorder(0);
            float[] Columnacli = new float[]{20f, 50f, 30f, 40f};
            tablaPaci.setWidths(Columnacli);
            tablaPaci.setHorizontalAlignment(Element.ALIGN_LEFT);
            PdfPCell cl1 = new PdfPCell(new Phrase("Dni", negrita));
            PdfPCell cl2 = new PdfPCell(new Phrase("Nombre", negrita));
            PdfPCell cl3 = new PdfPCell(new Phrase("Telefono", negrita));
            PdfPCell cl4 = new PdfPCell(new Phrase("Direccion", negrita));
            //PdfPCell cl5 = new PdfPCell(new Phrase("Sexo", negrita));
            cl1.setBorder(0);
            cl2.setBorder(0);
            cl3.setBorder(0);
            cl4.setBorder(0);
            //cl5.setBorder(0);
            tablaPaci.addCell(cl1);
            tablaPaci.addCell(cl2);
            tablaPaci.addCell(cl3);
            tablaPaci.addCell(cl4);
            //tablaPaci.addCell(cl5);
            tablaPaci.addCell(vista.txtDniVenta.getText());
            tablaPaci.addCell(vista.txtNombrespacienteVenta.getText());
            tablaPaci.addCell(vista.txtTelefonopacienteVenta.getText());
            tablaPaci.addCell(vista.txtDirecciPacienVenta.getText());

            doc.add(tablaPaci);

            //Medicamento
            PdfPTable tablaMe = new PdfPTable(4);
            tablaMe.setWidthPercentage(100);
            tablaMe.getDefaultCell().setBorder(0);
            float[] Columnapro = new float[]{10f, 50f, 15f, 20f};
            tablaMe.setWidths(Columnapro);
            tablaMe.setHorizontalAlignment(Element.ALIGN_LEFT);
            PdfPCell pro1 = new PdfPCell(new Phrase("Cant.", negrita));
            PdfPCell pro2 = new PdfPCell(new Phrase("Descripción", negrita));
            PdfPCell pro3 = new PdfPCell(new Phrase("Precio U.", negrita));
            PdfPCell pro4 = new PdfPCell(new Phrase("Precio T.", negrita));
            pro1.setBorder(0);
            pro2.setBorder(0);
            pro3.setBorder(0);
            pro4.setBorder(0);
            pro1.setBackgroundColor(BaseColor.DARK_GRAY);
            pro2.setBackgroundColor(BaseColor.DARK_GRAY);
            pro3.setBackgroundColor(BaseColor.DARK_GRAY);
            pro4.setBackgroundColor(BaseColor.DARK_GRAY);
            tablaMe.addCell(pro1);
            tablaMe.addCell(pro2);
            tablaMe.addCell(pro3);
            tablaMe.addCell(pro4);
            for (int i = 0; i < vista.tablaNuevaVenta.getRowCount(); i++) {
                String producto = vista.tablaNuevaVenta.getValueAt(i, 1).toString();
                String cantidad = vista.tablaNuevaVenta.getValueAt(i, 2).toString();
                String precio = vista.tablaNuevaVenta.getValueAt(i, 3).toString();
                String total = vista.tablaNuevaVenta.getValueAt(i, 4).toString();
                tablaMe.addCell(cantidad);
                tablaMe.addCell(producto);
                tablaMe.addCell(precio);
                tablaMe.addCell(total);
            }
            doc.add(tablaMe);

            Paragraph info = new Paragraph();
            info.add(Chunk.NEWLINE);
            info.add("Total a Pagar: " + Totalpagar);
            info.setAlignment(Element.ALIGN_RIGHT);
            doc.add(info);

            Paragraph firma = new Paragraph();
            firma.add(Chunk.NEWLINE);
            firma.add("Cancelación y Firma\n\n");
            firma.add("------------------------");
            firma.setAlignment(Element.ALIGN_CENTER);
            doc.add(firma);

            Paragraph mensaje = new Paragraph();
            mensaje.add(Chunk.NEWLINE);
            mensaje.add("Gracia pos su Compra");
            mensaje.setAlignment(Element.ALIGN_CENTER);
            doc.add(mensaje);
            doc.close();
            archivo.close();
            Desktop.getDesktop().open(file);
        } catch (DocumentException | IOException e) {
            System.out.println(e.toString());
        }
    }
}
