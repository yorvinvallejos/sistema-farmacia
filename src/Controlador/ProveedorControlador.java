package Controlador;

import Bean.ProveedorBean;
import Modelo.ProveedorDAO;
import Vista.Sistema;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class ProveedorControlador implements ActionListener {

    ProveedorDAO Prodao ;
    ProveedorBean pro;
    Sistema vista;
    DefaultTableModel modelo = new DefaultTableModel();

    public ProveedorControlador(ProveedorDAO Prodao, ProveedorBean pro, Sistema vista) {
        this.Prodao = Prodao;
        this.pro = pro;
        this.vista = vista;
        this.vista.btnGuardarProveedor.addActionListener(this);
        this.vista.btnProveedor.addActionListener(this);
        this.vista.btnElimiarPRoveedor.addActionListener(this);
        this.vista.btnNuevoProveedor.addActionListener(this);
        this.vista.btnActualizarProveedor.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.btnGuardarProveedor) {
            if (!"".equals(vista.txtRucProveedor.getText()) || !"".equals(vista.txtNombresProveedor.getText())
                    || !"".equals(vista.txtTelefonoProveedor.getText())
                    || !"".equals(vista.txtDireccionProveedor.getText()) || !"".equals(vista.txtRazonProvveedor.getText())) {
                pro.setRuc(Integer.parseInt(vista.txtRucProveedor.getText()));
                pro.setNombres(vista.txtNombresProveedor.getText());
                pro.setTelefono(Integer.parseInt(vista.txtTelefonoProveedor.getText()));
                pro.setDireccion(vista.txtDireccionProveedor.getText());
                pro.setRazon(vista.txtRazonProvveedor.getText());
                Prodao.RegistrarProveedor(pro);
                JOptionPane.showMessageDialog(null, "Proveedor Registrado");
                LimpiarTable();
                ListarProveedor();
                LimpiarProveedor();
            } else {
                JOptionPane.showMessageDialog(null, "Los campos esta vacios");
            }
        }

        if (e.getSource() == vista.btnProveedor) {
            LimpiarTable();
            ListarProveedor();
            vista.jTabbedPane1.setSelectedIndex(2);
        }

        if (e.getSource() == vista.btnElimiarPRoveedor) {
            if (!"".equals(vista.txtIdproveedor.getText())) {
                int pregunta = JOptionPane.showConfirmDialog(null, "Esta seguro de eliminar");
                if (pregunta == 0) {
                    int id = Integer.parseInt(vista.txtIdproveedor.getText());
                    Prodao.EliminarProveedor(id);
                    LimpiarTable();
                    ListarProveedor();
                    LimpiarProveedor();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Seleccione una fila");
            }
        }

        if (e.getSource() == vista.btnNuevoProveedor) {
            LimpiarProveedor();
        }
        if (e.getSource() == vista.btnActualizarProveedor) {
            if ("".equals(vista.txtIdproveedor.getText())) {
                JOptionPane.showMessageDialog(null, "Seleecione una fila");
            } else {
                if (!"".equals(vista.txtRucProveedor.getText()) || !"".equals(vista.txtNombresProveedor.getText()) || !"".equals(vista.txtTelefonoProveedor.getText()) || !"".equals(vista.txtDireccionProveedor.getText()) || !"".equals(vista.txtRazonProvveedor.getText())) {
                    pro.setRuc(Integer.parseInt(vista.txtRucProveedor.getText()));
                    pro.setNombres(vista.txtNombresProveedor.getText());
                    pro.setTelefono(Integer.parseInt(vista.txtTelefonoProveedor.getText()));
                    pro.setDireccion(vista.txtDireccionProveedor.getText());
                    pro.setRazon(vista.txtRazonProvveedor.getText());
                    pro.setId(Integer.parseInt(vista.txtIdproveedor.getText()));
                    Prodao.ModificarProveedor(pro);
                    JOptionPane.showMessageDialog(null, "Proveedor Modificado");
                    LimpiarTable();
                    ListarProveedor();
                    LimpiarProveedor();
                }
            }
        }

        vista.tablaProveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                int fila = vista.tablaProveedor.rowAtPoint(evt.getPoint());
                vista.txtIdproveedor.setText(vista.tablaProveedor.getValueAt(fila, 0).toString());
                vista.txtRucProveedor.setText(vista.tablaProveedor.getValueAt(fila, 1).toString());
                vista.txtNombresProveedor.setText(vista.tablaProveedor.getValueAt(fila, 2).toString());
                vista.txtTelefonoProveedor.setText(vista.tablaProveedor.getValueAt(fila, 3).toString());
                vista.txtDireccionProveedor.setText(vista.tablaProveedor.getValueAt(fila, 4).toString());
                vista.txtRazonProvveedor.setText(vista.tablaProveedor.getValueAt(fila, 5).toString());
            }
        });
    }

    ///////////////////////////////////////////////
    public void ListarProveedor() {
        List<ProveedorBean> ListarPro = Prodao.ListarProveedor();
        modelo = (DefaultTableModel) vista.tablaProveedor.getModel();
        Object[] ob = new Object[6];
        for (int i = 0; i < ListarPro.size(); i++) {
            ob[0] = ListarPro.get(i).getId();
            ob[1] = ListarPro.get(i).getRuc();
            ob[2] = ListarPro.get(i).getNombres();
            ob[3] = ListarPro.get(i).getTelefono();
            ob[4] = ListarPro.get(i).getDireccion();
            ob[5] = ListarPro.get(i).getRazon();
            modelo.addRow(ob);
        }
        vista.tablaProveedor.setModel(modelo);
        JTableHeader header = vista.tablaProveedor.getTableHeader();
        header.setOpaque(false);
        header.setBackground(Color.blue);
        header.setForeground(Color.white);

    }

    public void LimpiarTable() {
        for (int i = 0; i < modelo.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }
    }

    public void LimpiarProveedor() {
        vista.txtIdproveedor.setText("");
        vista.txtRucProveedor.setText("");
        vista.txtNombresProveedor.setText("");
        vista.txtTelefonoProveedor.setText("");
        vista.txtDireccionProveedor.setText("");
        vista.txtRazonProvveedor.setText("");
    }
}
