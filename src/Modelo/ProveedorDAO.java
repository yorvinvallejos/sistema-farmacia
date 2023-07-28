
package Modelo;

import Bean.ProveedorBean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProveedorDAO {
    
    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    public boolean RegistrarProveedor(ProveedorBean pro){
        String sql = "INSERT INTO proveedor(RUC, NOMBRES, TELEFONO, DIRECCION, RAZON) VALUES (?,?,?,?,?)";
        try {
           con = cn.getConnection();
           ps = con.prepareStatement(sql);
           ps.setInt(1, pro.getRuc());
           ps.setString(2, pro.getNombres());
           ps.setInt(3, pro.getTelefono());
           ps.setString(4, pro.getDireccion());
           ps.setString(5, pro.getRazon());
           ps.execute();
           return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        }finally{
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }
    }
    
    public List ListarProveedor(){
        List<ProveedorBean> Listapr = new ArrayList();
        String sql = "SELECT * FROM proveedor";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {                
                ProveedorBean pro = new ProveedorBean();
                pro.setId(rs.getInt("ID"));
                pro.setRuc(rs.getInt("RUC"));
                pro.setNombres(rs.getString("NOMBRES"));
                pro.setTelefono(rs.getInt("TELEFONO"));
                pro.setDireccion(rs.getString("DIRECCION"));
                pro.setRazon(rs.getString("RAZON"));
                Listapr.add(pro);
            }
            
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return Listapr;
    }
    
        public boolean EliminarProveedor(int id){
        String sql = "DELETE FROM proveedor WHERE ID = ? ";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        }finally{
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }
    }
        
    public boolean ModificarProveedor(ProveedorBean pr){
        String sql = "UPDATE proveedor SET RUC=?, NOMBRES=?, TELEFONO=?, DIRECCION=?, RAZON=? WHERE ID=?";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, pr.getRuc());
            ps.setString(2, pr.getNombres());
            ps.setInt(3, pr.getTelefono());
            ps.setString(4, pr.getDireccion());
            ps.setString(5, pr.getRazon());
            ps.setInt(6, pr.getId());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        }finally{
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }
    }
}
