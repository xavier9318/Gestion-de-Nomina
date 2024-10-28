
package com.mycompany.proyectonomina;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import com.mycompany.proyectonomina.sql.CConexion;

public class HorasExtrasDAO {

    // Método para calcular y guardar las horas extras en la base de datos
    public void guardarHorasExtras(int idEmpleado, String fecha, int tipoHora, float horasTrabajadas) {
        CConexion conexion = new CConexion();
        Connection conn = conexion.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            // Obtener el sueldo base del empleado
            String sqlSueldo = "SELECT sueldo_base FROM [dbo].[Empleado] WHERE id_empleado = ?";
            ps = conn.prepareStatement(sqlSueldo);
            ps.setInt(1, idEmpleado);
            rs = ps.executeQuery();

            if (rs.next()) {
                float sueldoBase = rs.getFloat("sueldo_base");
                float valorHora = sueldoBase / 240; // Cálculo del valor de la hora extra

                // Si es hora doble, multiplicar por 1.5
                if (tipoHora == 2) {
                    valorHora *= 1.5;
                }

                // Calcular el valor total a pagar por las horas trabajadas
                float valorTotal = valorHora * horasTrabajadas;

                // Insertar en la base de datos
                String sqlInsert = "INSERT INTO [dbo].[HorasExtras] (id_empleado, fecha, id_tipo_hora, horas_trabajadas, valor_pagado) VALUES (?, ?, ?, ?, ?)";
                ps = conn.prepareStatement(sqlInsert);

                // Configuramos los parámetros
                ps.setInt(1, idEmpleado);
                ps.setString(2, fecha);
                ps.setInt(3, tipoHora);
                ps.setFloat(4, horasTrabajadas);
                ps.setFloat(5, valorTotal);

                // Ejecutamos la inserción
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Horas extras guardadas correctamente. Valor total: Q" + valorTotal);
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró el empleado con ID: " + idEmpleado);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al guardar las horas extras: " + e.getMessage());
        } finally {
            try {
                if (rs != null) rs.close();
                if (ps != null) ps.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}


