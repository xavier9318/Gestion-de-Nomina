
package com.mycompany.proyectonomina;

import com.mycompany.proyectonomina.sql.CConexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class AnticipoService {
    
    // Método para generar anticipos del 45% del sueldo base de todos los empleados
    public void generarAnticipos(String fecha) {
        CConexion conexionBD = new CConexion();
        Connection conexion = conexionBD.getConnection();
        PreparedStatement pstSelect = null;
        PreparedStatement pstInsert = null;
        ResultSet rs = null;
        
        try {
            // Consulta para obtener todos los empleados con su sueldo base
            String consultaEmpleados = "SELECT id_empleado, sueldo_base FROM Empleado";
            pstSelect = conexion.prepareStatement(consultaEmpleados);
            rs = pstSelect.executeQuery();
            
            // Preparar la consulta de inserción en la tabla Anticipos
            String consultaInsertar = "INSERT INTO Anticipos (fecha, id_empleado, valor_anticipo) VALUES (?, ?, ?)";
            pstInsert = conexion.prepareStatement(consultaInsertar);
            
            // Recorrer todos los empleados y calcular el anticipo
            while (rs.next()) {
                int idEmpleado = rs.getInt("id_empleado");
                float sueldoBase = rs.getFloat("sueldo_base");
                float valorAnticipo = sueldoBase * 0.45f; // Calcular el 45% del sueldo base
                
                // Insertar el anticipo en la base de datos
                pstInsert.setString(1, fecha);
                pstInsert.setInt(2, idEmpleado);
                pstInsert.setFloat(3, valorAnticipo);
                pstInsert.executeUpdate();
            }
            
            JOptionPane.showMessageDialog(null, "Anticipos generados correctamente.");
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al generar anticipos: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        } finally {
            // Cerrar conexiones y recursos
            try {
                if (rs != null) rs.close();
                if (pstSelect != null) pstSelect.close();
                if (pstInsert != null) pstInsert.close();
                if (conexion != null) conexion.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    // Método para generar un anticipo específico para un empleado
    public void generarAnticipoIndividual(String fecha, int idEmpleado) {
        CConexion conexionBD = new CConexion();
        Connection conexion = conexionBD.getConnection();
        PreparedStatement pstSelect = null;
        PreparedStatement pstInsert = null;
        ResultSet rs = null;
        
        try {
            // Consulta para obtener el sueldo base del empleado
            String consultaEmpleado = "SELECT sueldo_base FROM Empleado WHERE id_empleado = ?";
            pstSelect = conexion.prepareStatement(consultaEmpleado);
            pstSelect.setInt(1, idEmpleado);
            rs = pstSelect.executeQuery();
            
            // Si el empleado existe, calcular el anticipo
            if (rs.next()) {
                float sueldoBase = rs.getFloat("sueldo_base");
                float valorAnticipo = sueldoBase * 0.45f; // Calcular el 45% del sueldo base
                
                // Preparar la consulta de inserción en la tabla Anticipos
                String consultaInsertar = "INSERT INTO Anticipos (fecha, id_empleado, valor_anticipo) VALUES (?, ?, ?)";
                pstInsert = conexion.prepareStatement(consultaInsertar);
                pstInsert.setString(1, fecha);
                pstInsert.setInt(2, idEmpleado);
                pstInsert.setFloat(3, valorAnticipo);
                pstInsert.executeUpdate();
                
                JOptionPane.showMessageDialog(null, "Anticipo generado correctamente para el empleado ID: " + idEmpleado);
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró un empleado con el ID: " + idEmpleado, "Error", JOptionPane.ERROR_MESSAGE);
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al generar anticipo: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        } finally {
            // Cerrar conexiones y recursos
            try {
                if (rs != null) rs.close();
                if (pstSelect != null) pstSelect.close();
                if (pstInsert != null) pstInsert.close();
                if (conexion != null) conexion.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
