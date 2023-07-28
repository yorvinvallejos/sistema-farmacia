package Modelo;

import Bean.ConfiguracionBean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class ConfiguracionDAO {

    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;


    public boolean ModificarDatos(ConfiguracionBean conf) {
        String sql = "UPDATE configuracion SET RUC=?, NOMBRE=?, TELEFONO=?, DIRECCION=?, RAZON=? WHERE ID=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, conf.getRuc());
            ps.setString(2, conf.getNombre());
            ps.setInt(3, conf.getTelefono());
            ps.setString(4, conf.getDireccion());
            ps.setString(5, conf.getRazon());
            ps.setInt(6, conf.getId());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }
    }
    
        public ConfiguracionBean BuscarDatos(){
        ConfiguracionBean conf = new ConfiguracionBean();
        String sql = "SELECT * FROM configuracion";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            if (rs.next()) {
                conf.setId(rs.getInt("ID"));
                conf.setRuc(rs.getInt("RUC"));
                conf.setNombre(rs.getString("NOMBRE"));
                conf.setTelefono(rs.getInt("TELEFONO"));
                conf.setDireccion(rs.getString("DIRECCION"));
                conf.setRazon(rs.getString("RAZON"));
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return conf;
    }
        
        
}
