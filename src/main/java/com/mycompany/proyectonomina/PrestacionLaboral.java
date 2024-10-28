/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectonomina;

import com.mycompany.proyectonomina.sql.CConexion;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;


public class PrestacionLaboral {
    public static void guardarPrestacionLaboral(int idEmpleado, String tipoPrestacion, Date fechaInicio, Date fechaFinal, double montoPrestacion) {
    String sql = "INSERT INTO Prestacion_Laboral (id_empleado, tipo_prestacion, fecha_inicio, fecha_final, fecha_prestacion, monto_prestacion) " +
                 "VALUES (?, ?, ?, ?, GETDATE(), ?)";

    CConexion conexion = new CConexion();
    try (Connection con = conexion.getConnection();
         PreparedStatement ps = con.prepareStatement(sql)) {
        
        ps.setInt(1, idEmpleado);
        ps.setString(2, tipoPrestacion);
        ps.setDate(3, new java.sql.Date(fechaInicio.getTime()));
        ps.setDate(4, new java.sql.Date(fechaFinal.getTime()));
        ps.setDouble(5, montoPrestacion);

        ps.executeUpdate();
    } catch (Exception e) {
        e.printStackTrace();
    }
}

   
    
}
