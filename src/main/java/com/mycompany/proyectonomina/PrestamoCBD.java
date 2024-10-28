package com.mycompany.proyectonomina;

import com.mycompany.proyectonomina.sql.CConexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;

public class PrestamoCBD {
    
    public boolean guardarPrestamo(int idEmpleado, LocalDate fechaSolicitud, double montoPrestamo, int plazoMeses, double saldoPendiente, double cuotaMensual) {
        String query = "INSERT INTO Prestamo (id_empleado, fecha_solicitud, monto_prestamo, plazo_meses, saldo_pendiente, cuota_mensual) VALUES (?, ?, ?, ?, ?, ?)";
        try {
            CConexion conexion = new CConexion();
            Connection conn = conexion.getConnection();
            
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, idEmpleado);
            ps.setDate(2, java.sql.Date.valueOf(fechaSolicitud));
            ps.setFloat(3, (float) montoPrestamo);
            ps.setInt(4, plazoMeses);
            ps.setFloat(5, (float) saldoPendiente);
            ps.setFloat(6, (float) cuotaMensual);
            
            int rowsInserted = ps.executeUpdate();
            ps.close();
            conn.close();
            
            return rowsInserted > 0;
            
        } catch (SQLException e) {
            System.out.println("Error al guardar el préstamo: " + e.getMessage());
            return false;
        }
    }
}
