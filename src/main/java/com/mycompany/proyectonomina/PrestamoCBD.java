package com.mycompany.proyectonomina;

import com.mycompany.proyectonomina.sql.CConexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.time.LocalDate;

public class PrestamoCBD {
    
    private CConexion conexion = new CConexion();

    // Método para verificar si un préstamo existe
    public boolean verificarPrestamoExistente(int idEmpleado) {
    boolean existe = false;
    Connection conn = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;
    
    try {
        conn = conexion.getConnection();
        String sql = "SELECT COUNT(*) FROM Prestamo WHERE id_empleado = ?";
        stmt = conn.prepareStatement(sql);
        stmt.setInt(1, idEmpleado);
        rs = stmt.executeQuery();
        
        if (rs.next()) {
            existe = rs.getInt(1) > 0; // Si hay al menos un registro, el préstamo existe
        }
    } catch (Exception e) {
        e.printStackTrace(); // Imprime el error en la consola
        JOptionPane.showMessageDialog(null, "Error al verificar el préstamo: " + e.getMessage());
    } finally {
        try { if (rs != null) rs.close(); } catch (Exception e) {}
        try { if (stmt != null) stmt.close(); } catch (Exception e) {}
        try { if (conn != null) conn.close(); } catch (Exception e) {}
    }
    
    return existe;
}

public void guardarPrestamo(int idEmpleado, LocalDate fechaPrestamo, double montoPrestamo, int plazoMeses, double cuotaMensual) {
    Connection conn = null;
    PreparedStatement pstmt = null;

    try {
        conn = conexion.getConnection();
        String sql = "INSERT INTO Prestamo (id_empleado, fecha_solicitud, monto_prestamo, plazo_meses, cuota_mensual) VALUES (?, ?, ?, ?, ?)"; // Ajusta la columna fecha_solicitud
        pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, idEmpleado);
        pstmt.setDate(2, java.sql.Date.valueOf(fechaPrestamo));
        pstmt.setDouble(3, montoPrestamo);
        pstmt.setInt(4, plazoMeses);
        pstmt.setDouble(5, cuotaMensual);
        pstmt.executeUpdate();
        JOptionPane.showMessageDialog(null, "Préstamo guardado exitosamente.");
    } catch (Exception e) {
        e.printStackTrace(); // Imprime el error en la consola
        JOptionPane.showMessageDialog(null, "Error al guardar el préstamo: " + e.getMessage());
    } finally {
        try { if (pstmt != null) pstmt.close(); } catch (Exception e) {}
        try { if (conn != null) conn.close(); } catch (Exception e) {}
    }
}
}