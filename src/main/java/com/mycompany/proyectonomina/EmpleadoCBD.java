package com.mycompany.proyectonomina;

import com.mycompany.proyectonomina.sql.CConexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class EmpleadoCBD {

    // Método para obtener el nombre completo del empleado
    public static String obtenerNombreCompleto(int idEmpleado) {
        String nombreCompleto = " ";
        String sql = "SELECT nombre, apellido FROM Empleado WHERE id_empleado = ?";
        
        // Obtener la conexión de la clase CConexion
        CConexion conexion = new CConexion();
        try (Connection con = conexion.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
             
            // Establece el ID del empleado en la consulta
            ps.setInt(1, idEmpleado);
            
            // Ejecuta la consulta
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    String nombre = rs.getString("nombre").trim();
                    String apellido = rs.getString("apellido").trim();
                    nombreCompleto = nombre + " " + apellido;
                }
            }
        } catch (Exception e) {
            e.printStackTrace(); // Muestra el error en la consola
        }
        return nombreCompleto;
    }
    public static double obtenerSueldo(int idEmpleado) {
    double sueldo = 0.0;
    String sql = "SELECT sueldo_base FROM Empleado WHERE id_empleado = ?";
    
    CConexion conexion = new CConexion();
    try (Connection con = conexion.getConnection();
         PreparedStatement ps = con.prepareStatement(sql)) {
         
        ps.setInt(1, idEmpleado);
        
        try (ResultSet rs = ps.executeQuery()) {
            if (rs.next()) {
                sueldo = rs.getDouble("sueldo_base");
            }
        }
    } catch (Exception e) {
        e.printStackTrace(); // Muestra el error en la consola
    }
    return sueldo;
}
}
