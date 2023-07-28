
package Modelo;

import Bean.LoginBean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDAO {
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Conexion cn = new Conexion();
    
    public LoginBean log(String nombres, String contraseña){       
        String sql = "SELECT * FROM usuario WHERE NOMBRES = ? AND CONTRASEÑA = ?";
        LoginBean lg = new LoginBean();
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, nombres);
            ps.setString(2, contraseña);
            rs= ps.executeQuery();
            
            if (rs.next()) {
                lg.setId(rs.getInt("ID"));
                lg.setNombres(rs.getString("NOMBRES"));
                lg.setCorreo(rs.getString("CORREO"));
                lg.setContraseña(rs.getString("CONTRASEÑA"));
                lg.setRol(rs.getString("ROL"));
                
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return lg;
    }
    
}
