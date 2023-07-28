package Modelo;
import Bean.PacienteBean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class PacienteDAO {

    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;	

    public boolean RegistrarPaciente(PacienteBean paci) {
        String sql = "INSERT INTO paciente (DNI,NOMBRE,TELEFONO,DIRECCION,SEXO) VALUES (?,?,?,?,?)";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, paci.getDni());
            ps.setString(2, paci.getNombre());
            ps.setInt(3, paci.getTelefono());
            ps.setString(4, paci.getDireccion());
            ps.setString(5, paci.getSexo());
            ps.execute();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }
    }

    public List ListarPaciente() {
        List<PacienteBean> ListaPac = new ArrayList();
        String sql = "SELECT * FROM paciente";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                PacienteBean cl = new PacienteBean();
                cl.setId(rs.getInt("ID"));
                cl.setDni(rs.getInt("DNI"));
                cl.setNombre(rs.getString("NOMBRE"));
                cl.setTelefono(rs.getInt("TELEFONO"));
                cl.setDireccion(rs.getString("DIRECCION"));
                cl.setSexo(rs.getString("SEXO"));
                ListaPac.add(cl);
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return ListaPac;
    }

    public boolean EliminarPaciente(int id) {
        String sql = "DELETE FROM paciente WHERE ID = ?";
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

    public boolean ModificarPaciente(PacienteBean paci) {
        String sql = "UPDATE paciente SET DNI=?, NOMBRE=?, TELEFONO=?, DIRECCION=?, SEXO=? WHERE ID=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, paci.getDni());
            ps.setString(2, paci.getNombre());
            ps.setInt(3, paci.getTelefono());
            ps.setString(4, paci.getDireccion());
            ps.setString(5, paci.getSexo());
            ps.setInt(6, paci.getId());
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

    public PacienteBean BuscarPaciente(int dni) {
        PacienteBean cl = new PacienteBean();
        String sql = "SELECT * FROM paciente WHERE DNI = ?";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            rs = ps.executeQuery();
            if (rs.next()) {
                cl.setNombre(rs.getString("NOMBRE"));
                cl.setTelefono(rs.getInt("TELEFONO"));
                cl.setDireccion(rs.getString("DIRECCION"));
                cl.setSexo(rs.getString("SEXO"));
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return cl;
    }

}
