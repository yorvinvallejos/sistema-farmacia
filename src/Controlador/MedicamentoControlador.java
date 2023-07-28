package Controlador;

import Bean.MedicamentoBean;
import Modelo.MedicamentoDAO;
import Reportes.Excel;
import Vista.Sistema;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class MedicamentoControlador implements ActionListener {

    MedicamentoDAO MediDAO ;
    Excel ex = new Excel();
    MedicamentoBean Medi;
    Sistema vista;
    DefaultTableModel modelo = new DefaultTableModel();
      
    public MedicamentoControlador(MedicamentoDAO MediDAO, MedicamentoBean Medi, Sistema vista) {
        this.MediDAO = MediDAO;
        this.Medi = Medi;
        this.vista = vista;
        this.vista.btnAgregarMedi.addActionListener(this);
        this.vista.btnMedicament.addActionListener(this);
        this.vista.btnEliminarMedi.addActionListener(this);
        this.vista.btnNuevoMedi.addActionListener(this);
        this.vista.btnActualizarMedi.addActionListener(this);
        this.vista.btnExcelMedi.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.btnAgregarMedi) {
            if (!"".equals(vista.txtCodigoMedi.getText()) || !"".equals(vista.txtDescriMedi.getText())
                    || !"".equals(vista.comoProveedor.getSelectedItem())
                    || !"".equals(vista.txtCantidadMedi.getText()) || !"".equals(vista.txtPrecioMedi.getText())) {
                Medi.setCodigo(vista.txtCodigoMedi.getText());
                Medi.setDescripcion(vista.txtDescriMedi.getText());
                Medi.setProveedor(vista.comoProveedor.getSelectedItem().toString());
                Medi.setStock(Integer.parseInt(vista.txtCantidadMedi.getText()));
                Medi.setPrecio(Double.parseDouble(vista.txtPrecioMedi.getText()));
                MediDAO.RegistrarMedicamento(Medi);
                JOptionPane.showMessageDialog(null, "Productos Registrado");
                LimpiarTable();
                ListarMedicamento();
                LimpiarMedicamento();

            } else {
                JOptionPane.showMessageDialog(null, "Los campos estan vacios");
            }

        }

        if (e.getSource() == vista.btnMedicament) {
            LimpiarTable();
            ListarMedicamento();
            vista.jTabbedPane1.setSelectedIndex(3);
        }

        if (e.getSource() == vista.btnEliminarMedi) {
            if (!"".equals(vista.txtIdMedi.getText())) {
                int pregunta = JOptionPane.showConfirmDialog(null, "Esta seguro de eliminar");
                if (pregunta == 0) {
                    int id = Integer.parseInt(vista.txtIdMedi.getText());
                    MediDAO.EliminarMedicamento(id);
                    LimpiarTable();
                    LimpiarMedicamento();
                    ListarMedicamento();
                }
            }
        }
        if (e.getSource() == vista.btnNuevoMedi) {
            LimpiarMedicamento();
        }

        if (e.getSource() == vista.btnActualizarMedi) {
            if ("".equals(vista.txtIdMedi.getText())) {
                JOptionPane.showMessageDialog(null, "Seleecione una fila");
            } else {
                if (!"".equals(vista.txtCodigoMedi.getText())
                        || !"".equals(vista.txtDescriMedi.getText())
                        || !"".equals(vista.txtCantidadMedi.getText())
                        || !"".equals(vista.txtPrecioMedi.getText())) {
                    Medi.setCodigo(vista.txtCodigoMedi.getText());
                    Medi.setDescripcion(vista.txtDescriMedi.getText());
                    Medi.setProveedor(vista.comoProveedor.getSelectedItem().toString());
                    Medi.setStock(Integer.parseInt(vista.txtCantidadMedi.getText()));
                    Medi.setPrecio(Double.parseDouble(vista.txtPrecioMedi.getText()));
                    Medi.setId(Integer.parseInt(vista.txtIdMedi.getText()));
                    MediDAO.ModificarMedicamento(Medi);
                    JOptionPane.showMessageDialog(null, "Medicamento Modificado");
                    LimpiarTable();
                    ListarMedicamento();
                    LimpiarMedicamento();
                }
            }
        }

        if (e.getSource() == vista.btnExcelMedi) {
            ex.reporte();
        }

        vista.tablaMedicamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                int fila = vista.tablaMedicamento.rowAtPoint(evt.getPoint());
                vista.txtIdMedi.setText(vista.tablaMedicamento.getValueAt(fila, 0).toString());
                vista.txtCodigoMedi.setText(vista.tablaMedicamento.getValueAt(fila, 1).toString());
                vista.txtDescriMedi.setText(vista.tablaMedicamento.getValueAt(fila, 2).toString());
                vista.txtPrecioMedi.setText(vista.tablaMedicamento.getValueAt(fila, 3).toString());
                vista.txtCantidadMedi.setText(vista.tablaMedicamento.getValueAt(fila, 4).toString());
                vista.txtPrecioMedi.setText(vista.tablaMedicamento.getValueAt(fila, 5).toString());

                //tablaNuevaVentaMouseClicked(evt);
            }
        });
    }
    /////////////////////////////////

    public void LimpiarTable() {
        for (int i = 0; i < modelo.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }
    }

    public void ListarMedicamento() {
        List<MedicamentoBean> ListarPac = MediDAO.ListarmMedicament();
        modelo = (DefaultTableModel) vista.tablaMedicamento.getModel();
        Object[] ob = new Object[6];
        for (int i = 0; i < ListarPac.size(); i++) {
            ob[0] = ListarPac.get(i).getId();
            ob[1] = ListarPac.get(i).getCodigo();
            ob[2] = ListarPac.get(i).getDescripcion();
            ob[3] = ListarPac.get(i).getProveedor();
            ob[4] = ListarPac.get(i).getStock();
            ob[5] = ListarPac.get(i).getPrecio();
            modelo.addRow(ob);
        }
        vista.tablaMedicamento.setModel(modelo);
        JTableHeader header=  vista.tablaMedicamento.getTableHeader();
        header.setOpaque(false);
        header.setBackground(Color.blue);
        header.setForeground(Color.white);

    }

    public void LimpiarMedicamento() {
        vista.txtIdMedi.setText("");
        vista.txtCodigoMedi.setText("");
        vista.txtDescriMedi.setText("");
        vista.comoProveedor.setSelectedIndex(0);
        vista.txtCantidadMedi.setText("");
        vista.txtPrecioMedi.setText("");
    }

}
