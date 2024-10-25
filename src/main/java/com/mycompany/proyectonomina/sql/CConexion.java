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
    
    public Connection getConnection() {
    if (conectar == null) {
        establecerConexion(); // Establece la conexión si aún no se ha hecho
    }
    return conectar;
}
    
    public Connection establecerConexion() {
        try {
            // Modificando la cadena de conexión
            String cadena = "jdbc:sqlserver://" + ip + ":" + puerto + ";databaseName=" + bd + ";encrypt=true;trustServerCertificate=true;";
            conectar = DriverManager.getConnection(cadena, usuario, contrasenia);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al conectar a la base de datos, error: " + e.toString());
        }
        return conectar;
    }
}


