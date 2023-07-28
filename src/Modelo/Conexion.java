package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    Connection con;

    public Connection getConnection() {
        try {

            //String access = "jdbc:ucanaccess://D:/sistemafarmacia.accdb";
            String myBD = "jdbc:mysql://localhost:3306/sistemafarmacia";
            con = DriverManager.getConnection(myBD, "root", "Yorvin@vallejos/2000_02");
            return con;
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return null;
    }

}
