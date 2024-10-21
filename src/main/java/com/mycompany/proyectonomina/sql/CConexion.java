package com.mycompany.proyectonomina.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class CConexion {
    Connection conectar = null;
    
    String usuario = "usersql";
    String contrasenia = "root";
    String bd = "NOMINA";
    String ip = "localhost";
    String puerto = "1433";
    
    public Connection establecerConexion() {
        try {
            // Modificando la cadena de conexión
            String cadena = "jdbc:sqlserver://" + ip + ":" + puerto + ";databaseName=" + bd + ";encrypt=true;trustServerCertificate=true;";
            conectar = DriverManager.getConnection(cadena, usuario, contrasenia);
            JOptionPane.showMessageDialog(null, "Se conectó correctamente a la Base de Datos");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al conectar a la base de datos, error: " + e.toString());
        }
        return conectar;
    }
}


