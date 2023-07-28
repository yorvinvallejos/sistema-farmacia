package Controlador;

import Bean.LoginBean;
import Modelo.LoginDAO;
import Vista.Login;
import Vista.Sistema;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class LoginControlador implements ActionListener {

    private final LoginDAO lgDAO; 
    private LoginBean lg;
    private final Login vista; 

    DefaultTableModel modelo = new DefaultTableModel();

    public LoginControlador(LoginBean lg, LoginDAO lgDAO, Login vista) {
        this.lgDAO = lgDAO;
        this.lg = lg;
        this.vista = vista;
        this.vista.btnIniciar.addActionListener(this);
        this.vista.btnCancelar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.btnIniciar) {
            if (vista.txtNombres.getText().equals("")
                || String.valueOf(vista.txtContraseña.getPassword()).equals("")) {
            JOptionPane.showMessageDialog(null, "Correo o la Contraseña estan vacios");

        } else {
            String nombres = vista.txtNombres.getText();
            String contraseña = String.valueOf(vista.txtContraseña.getPassword());
            lg = lgDAO.log(nombres, contraseña);
            if (lg.getNombres() != null) {
                Sistema sis = new Sistema();
                sis.setVisible(true);
                this.vista.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Correo o la Contraseña son incorrectos");
            }
        }
        }/*else{
            int preguntra=JOptionPane.showConfirmDialog(null, "Estas seguro de salir", "Pregunta", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
            if(preguntra==0){
                System.exit(0);
            }
        }*/
        if (e.getSource() == vista.btnCancelar) {
            //int preguntra=JOptionPane.showConfirmDialog(null, "Estas seguro de salir", "Pregunta", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
            //if(preguntra==0){
                System.exit(0);
        //}
        
     }
    }
}