package Modelo;

import Bean.MedicamentoBean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;

public class MedicamentoDAO {

    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;

    public boolean RegistrarMedicamento(MedicamentoBean med) {
        String sql = "INSERT INTO medicamento (CODIGO, DESCRIPCION, PROVEEDOR, STOCK, PRECIO) VALUES (?,?,?,?,?)";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, med.getCodigo());
            ps.setString(2, med.getDescripcion());
            ps.setString(3, med.getProveedor());
            ps.setInt(4, med.getStock());
            ps.setDouble(5, med.getPrecio());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        }
    }

    public void ConsularProveedor(JComboBox proveedor) {
        String sql = "SELECT NOMBRES FROM proveedor";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                proveedor.addItem(rs.getString("NOMBRES"));
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
    }

    public List ListarmMedicament() {
        List<MedicamentoBean> Listapro = new ArrayList();
        String sql = "SELECT * FROM medicamento";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                MedicamentoBean pro = new MedicamentoBean();
                pro.setId(rs.getInt("ID"));
                pro.setCodigo(rs.getString("CODIGO"));
                pro.setDescripcion(rs.getString("DESCRIPCION"));
                pro.setProveedor(rs.getString("PROVEEDOR"));
                pro.setStock(rs.getInt("STOCK"));
                pro.setPrecio(rs.getDouble("PRECIO"));
                Listapro.add(pro);
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return Listapro;
    }

    public boolean EliminarMedicamento(int id) {
        String sql = "DELETE FROM medicamento WHERE ID = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                System.out.println(ex.toString());
            }
        }
    }

    public boolean ModificarMedicamento(MedicamentoBean medi) {
        String sql = "UPDATE medicamento SET CODIGO=?, DESCRIPCION=?, PROVEEDOR=?, STOCK=?, PRECIO=? WHERE ID=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, medi.getCodigo());
            ps.setString(2, medi.getDescripcion());
            ps.setString(3, medi.getProveedor());
            ps.setInt(4, medi.getStock());
            ps.setDouble(5, medi.getPrecio());
            ps.setInt(6, medi.getId());
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

    public MedicamentoBean BuscarMedicamento(String cod) {
        MedicamentoBean medica = new MedicamentoBean();
        String sql = "SELECT * FROM medicamento WHERE CODIGO = ?";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, cod);
            rs = ps.executeQuery();
            if (rs.next()) {
                medica.setDescripcion(rs.getString("DESCRIPCION"));
                medica.setPrecio(rs.getDouble("PRECIO"));
                medica.setStock(rs.getInt("STOCK"));
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return medica;
    }
    
       
}
