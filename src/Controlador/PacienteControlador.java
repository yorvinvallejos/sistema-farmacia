package Controlador;

import Bean.PacienteBean;
import Modelo.PacienteDAO;
import Vista.Sistema;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class PacienteControlador implements ActionListener {

    PacienteDAO Padao; 
    PacienteBean paci;
    Sistema vista;
    DefaultTableModel modelo = new DefaultTableModel();

    public PacienteControlador(PacienteDAO Padao, PacienteBean paci, Sistema vista) {
        this.Padao = Padao;
        this.paci = paci;
        this.vista = vista;
        this.vista.btnGuardarPaciente.addActionListener(this);
        this.vista.btnEliminarPaciente.addActionListener(this);
        this.vista.btnPaciente.addActionListener(this);
        this.vista.btnActualizarpaciente.addActionListener(this);
        this.vista.btnnuevoPaciente.addActionListener(this);
        this.vista.btnNuevaVenta.addActionListener(this);
        this.vista.btnVentas.addActionListener(this);
        this.vista.btnConfiguraacion.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.btnGuardarPaciente) {
            if (!"".equals(vista.txtDniPaciente.getText()) || !"".equals(vista.txtNombresPaciente.getText())
                    || !"".equals(vista.txttelefonoPaciente.getText()) || !"".equals(vista.txtDireccionPaciente.getText())) {
                paci.setDni(Integer.parseInt(vista.txtDniPaciente.getText()));
                paci.setNombre(vista.txtNombresPaciente.getText());
                paci.setTelefono(Integer.parseInt(vista.txttelefonoPaciente.getText()));
                paci.setDireccion(vista.txtDireccionPaciente.getText());
                paci.setSexo(vista.comboSexoPaciente.getSelectedItem().toString());
                Padao.RegistrarPaciente(paci);
                JOptionPane.showMessageDialog(null, "Paciente Registrado");
                LimpiarTable();
                LimpiarPaciente();
                ListarPaciente();
            } else {
                JOptionPane.showMessageDialog(null, "Los campos estan vacios");
            }
        }
        ////
        if (e.getSource() == vista.btnPaciente) {
            LimpiarTable();
            ListarPaciente();
            vista.jTabbedPane1.setSelectedIndex(1);
        }
        ///

        if (e.getSource() == vista.btnEliminarPaciente) {
            if (!"".equals(vista.txtidPaciente.getText())) {
                int pregunta = JOptionPane.showConfirmDialog(null, "Esta seguro de eliminar");
                if (pregunta == 0) {
                    int id = Integer.parseInt(vista.txtidPaciente.getText());
                    Padao.EliminarPaciente(id);
                    LimpiarTable();
                    LimpiarPaciente();
                    ListarPaciente();
                }
            }

        }

        if (e.getSource() == vista.btnActualizarpaciente) {
            if ("".equals(vista.txtidPaciente.getText())) {
                JOptionPane.showMessageDialog(null, "seleccione una fila");
            } else {

                if (!"".equals(vista.txtDniPaciente.getText()) || !"".equals(vista.txtNombresPaciente.getText()) || !"".equals(vista.txttelefonoPaciente.getText())) {
                    paci.setDni(Integer.parseInt(vista.txtDniPaciente.getText()));
                    paci.setNombre(vista.txtNombresPaciente.getText());
                    paci.setTelefono(Integer.parseInt(vista.txttelefonoPaciente.getText()));
                    paci.setDireccion(vista.txtDireccionPaciente.getText());
                    paci.setSexo(vista.comboSexoPaciente.getSelectedItem().toString());
                    paci.setId(Integer.parseInt(vista.txtidPaciente.getText()));
                    Padao.ModificarPaciente(paci);
                    JOptionPane.showMessageDialog(null, "Paciente Modificado");
                    LimpiarTable();
                    LimpiarPaciente();
                    ListarPaciente();
                } else {
                    JOptionPane.showMessageDialog(null, "Los campos estan vacios");
                }
            }
        }

        if (e.getSource() == vista.btnnuevoPaciente) {
            LimpiarPaciente();
        }
        //evento de la tabla paciente
        vista.tablaPaciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                int fila = vista.tablaPaciente.rowAtPoint(evt.getPoint());
                vista.txtidPaciente.setText(vista.tablaPaciente.getValueAt(fila, 0).toString());
                vista.txtDniPaciente.setText(vista.tablaPaciente.getValueAt(fila, 1).toString());
                vista.txtNombresPaciente.setText(vista.tablaPaciente.getValueAt(fila, 2).toString());
                vista.txttelefonoPaciente.setText(vista.tablaPaciente.getValueAt(fila, 3).toString());
                vista.txtDireccionPaciente.setText(vista.tablaPaciente.getValueAt(fila, 4).toString());
                vista.comboSexoPaciente.setSelectedItem(vista.tablaPaciente.getValueAt(fila, 5).toString());
            }
        });
    }

    ////////////////////////////////////////////////////////////
    public void ListarPaciente() {
        List<PacienteBean> ListarPac = Padao.ListarPaciente();
        modelo = (DefaultTableModel) vista.tablaPaciente.getModel();
        Object[] ob = new Object[6];
        for (int i = 0; i < ListarPac.size(); i++) {
            ob[0] = ListarPac.get(i).getId();
            ob[1] = ListarPac.get(i).getDni();
            ob[2] = ListarPac.get(i).getNombre();
            ob[3] = ListarPac.get(i).getTelefono();
            ob[4] = ListarPac.get(i).getDireccion();
            ob[5] = ListarPac.get(i).getSexo();
            modelo.addRow(ob);
        }
        vista.tablaPaciente.setModel(modelo);
        JTableHeader header = vista.tablaPaciente.getTableHeader();
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

    public void LimpiarPaciente() {
        vista.txtidPaciente.setText("");
        vista.txtDniPaciente.setText("");
        vista.txtNombresPaciente.setText("");
        vista.txttelefonoPaciente.setText("");
        vista.txtDireccionPaciente.setText("");
        vista.comboSexoPaciente.setSelectedIndex(0);
    }
}
