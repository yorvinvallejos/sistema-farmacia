
package Controlador;

import Bean.ConfiguracionBean;
import Modelo.ConfiguracionDAO;
import Vista.Sistema;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ConfiguracionControlador implements ActionListener{

    ConfiguracionBean conf;
    ConfiguracionDAO conDAO;
    Sistema vista;

    public ConfiguracionControlador(ConfiguracionBean conf, ConfiguracionDAO conDAO, Sistema vista) {
        this.conf = conf;
        this.conDAO = conDAO;
        this.vista = vista;
        this.vista.btnActualizarFarmacia.addActionListener(this);
        this.vista.btnConfiguraacion.addActionListener(this);
    }
  
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == vista.btnActualizarFarmacia) {
            if (!"".equals(vista.txtRucFarmacia.getText()) || 
                    !"".equals(vista.txtNombreFarmacia.getText()) ||
                    !"".equals(vista.txtTelefonoFarmacia.getText()) ||
                    !"".equals(vista.txtDireccionFarmacia.getText())) {
            conf.setRuc(Integer.parseInt(vista.txtRucFarmacia.getText()));
            conf.setNombre(vista.txtNombreFarmacia.getText());
            conf.setTelefono(Integer.parseInt(vista.txtTelefonoFarmacia.getText()));
            conf.setDireccion(vista.txtDireccionFarmacia.getText());
            conf.setRazon(vista.txtRazonSocialFarmacia.getText());
            conf.setId(Integer.parseInt(vista.txtIdFarmacia.getText()));
            conDAO.ModificarDatos(conf);
            JOptionPane.showMessageDialog(null, "Datos de la empresa modificado");
            ListarConfig();
        } else {
            JOptionPane.showMessageDialog(null, "Los campos estan vacios");
        }
        }
        
        if (e.getSource() == vista.btnConfiguraacion) {
            ListarConfig();
            vista.jTabbedPane1.setSelectedIndex(5);
        }
    }
        public void ListarConfig() {
        conf = conDAO.BuscarDatos();
        vista.txtIdFarmacia.setText("" + conf.getId());
        vista.txtRucFarmacia.setText("" + conf.getRuc());
        vista.txtNombreFarmacia.setText("" + conf.getNombre());
        vista.txtTelefonoFarmacia.setText("" + conf.getTelefono());
        vista.txtDireccionFarmacia.setText("" + conf.getDireccion());
        vista.txtRazonSocialFarmacia.setText("" + conf.getRazon());
    }
}
