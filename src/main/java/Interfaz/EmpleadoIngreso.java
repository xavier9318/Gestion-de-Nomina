
package Interfaz;

import com.mycompany.proyectonomina.sql.CConexion;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class EmpleadoIngreso extends javax.swing.JFrame {

    /**
     * Creates new form EmpleadoIngreso
     */
    public EmpleadoIngreso() {
        initComponents();
    }
    // Método para guardar el empleado en la base de datos
   

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        txtDpi = new javax.swing.JTextField();
        txtSueldoBase = new javax.swing.JTextField();
        txtFechaNacimiento = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        btnGuardarEmpleado = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtFechaContratacion = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtIdPuesto = new javax.swing.JTextField();
        btnCargarFoto = new javax.swing.JButton();
        btnCargarExpediente = new javax.swing.JButton();
        btnIngresoFamiliares = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto Black", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Ingreso Empleado");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Nombres:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 70, -1));

        jLabel3.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Apellidos:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 94, -1));

        jLabel4.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Fecha Nacimiento:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 130, -1));

        jLabel5.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Sueldo Base:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 96, -1));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 297, 49, -1));

        jLabel7.setFont(new java.awt.Font("Roboto Medium", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("DPI:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 41, -1));

        txtApellido.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.light"));
        txtApellido.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });
        jPanel1.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 266, -1));

        txtDpi.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.light"));
        txtDpi.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        txtDpi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDpiActionPerformed(evt);
            }
        });
        jPanel1.add(txtDpi, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 151, -1));

        txtSueldoBase.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.light"));
        txtSueldoBase.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        txtSueldoBase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSueldoBaseActionPerformed(evt);
            }
        });
        jPanel1.add(txtSueldoBase, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 100, -1));

        txtFechaNacimiento.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.light"));
        txtFechaNacimiento.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        txtFechaNacimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaNacimientoActionPerformed(evt);
            }
        });
        jPanel1.add(txtFechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 100, -1));

        txtNombre.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.light"));
        txtNombre.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 266, -1));

        btnGuardarEmpleado.setBackground(new java.awt.Color(153, 153, 153));
        btnGuardarEmpleado.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        btnGuardarEmpleado.setText("Guardar");
        btnGuardarEmpleado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarEmpleadoActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardarEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 380, 120, -1));

        jLabel9.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Fecha de contratacion:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));

        txtFechaContratacion.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.light"));
        txtFechaContratacion.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jPanel1.add(txtFechaContratacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 103, -1));

        jLabel10.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Codigo Puesto:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 110, -1));

        txtIdPuesto.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.light"));
        txtIdPuesto.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jPanel1.add(txtIdPuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, 74, -1));

        btnCargarFoto.setBackground(new java.awt.Color(204, 204, 255));
        btnCargarFoto.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnCargarFoto.setText("Cargar Foto");
        btnCargarFoto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnCargarFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 180, 160, -1));

        btnCargarExpediente.setBackground(new java.awt.Color(204, 204, 255));
        btnCargarExpediente.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnCargarExpediente.setText("Cargar Expediente");
        btnCargarExpediente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnCargarExpediente, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 220, 160, -1));

        btnIngresoFamiliares.setBackground(new java.awt.Color(204, 204, 255));
        btnIngresoFamiliares.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnIngresoFamiliares.setText("Familiares");
        btnIngresoFamiliares.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIngresoFamiliares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresoFamiliaresActionPerformed(evt);
            }
        });
        jPanel1.add(btnIngresoFamiliares, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 140, 160, -1));

        btnModificar.setBackground(new java.awt.Color(204, 204, 255));
        btnModificar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 260, 160, -1));

        btnRegresar.setBackground(new java.awt.Color(153, 153, 153));
        btnRegresar.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        btnRegresar.setText("Regresar");
        btnRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 380, 110, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 705, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoActionPerformed

    private void txtDpiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDpiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDpiActionPerformed

    private void txtSueldoBaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSueldoBaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSueldoBaseActionPerformed

    private void txtFechaNacimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaNacimientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaNacimientoActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnGuardarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarEmpleadoActionPerformed
                                                       
    // Obtener datos de los campos de texto
    String nombre = txtNombre.getText().trim();
    String apellido = txtApellido.getText().trim();
    String dpi = txtDpi.getText().trim();
    String sueldoBase = txtSueldoBase.getText().trim();
    String fechaNacimiento = txtFechaNacimiento.getText().trim(); // Formato YYYY-MM-DD
    String fechaContratacion = txtFechaContratacion.getText().trim(); // Formato YYYY-MM-DD
    String idPuesto = txtIdPuesto.getText().trim(); // Campo de texto o ComboBox para seleccionar el puesto

    // Verificar que los campos no estén vacíos
    if (nombre.isEmpty() || apellido.isEmpty() || dpi.isEmpty() || sueldoBase.isEmpty() || fechaNacimiento.isEmpty() || fechaContratacion.isEmpty() || idPuesto.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios.");
        return; // Detener el proceso si algún campo está vacío
    }

    // Conectar a la base de datos
    CConexion conexion = new CConexion();
    Connection conn = conexion.establecerConexion();

    if (conn != null) {
        // Incluir idPuesto en la consulta SQL
        String sql = "INSERT INTO empleado (id_puesto, nombre, apellido, dpi, sueldo_base, fecha_nacimiento, fecha_contratacion) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, Integer.parseInt(idPuesto)); // Convertir idPuesto a entero
            pstmt.setString(2, nombre);
            pstmt.setString(3, apellido);
            pstmt.setString(4, dpi);
            pstmt.setFloat(5, Float.parseFloat(sueldoBase));
            pstmt.setDate(6, java.sql.Date.valueOf(fechaNacimiento)); // Formato YYYY-MM-DD
            pstmt.setDate(7, java.sql.Date.valueOf(fechaContratacion)); // Formato YYYY-MM-DD

            int filasAfectadas = pstmt.executeUpdate();
            if (filasAfectadas > 0) {
                JOptionPane.showMessageDialog(this, "Empleado guardado exitosamente.");
            } else {
                JOptionPane.showMessageDialog(this, "Error al guardar el empleado.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al guardar en la base de datos: " + e.getMessage());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        } finally {
            try {
                conn.close(); // Cerrar la conexión
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    }//GEN-LAST:event_btnGuardarEmpleadoActionPerformed

    private void btnIngresoFamiliaresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresoFamiliaresActionPerformed
       int idEmpleado = obtenerIdEmpleado(); // Método para obtener el ID del empleado recién creado

    // Crear una instancia de la ventana de ingreso de familiares y pasar el ID del empleado
    IngresoDatosFamiliares ventanaFamiliares = new IngresoDatosFamiliares(idEmpleado);
    ventanaFamiliares.setVisible(true); // Muestra la ventana de ingreso de familiares
    this.dispose(); // Opcional: cierra la ventana actual si es necesario
        
    }//GEN-LAST:event_btnIngresoFamiliaresActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        Dashboard ventanaprincipal = new Dashboard();
        ventanaprincipal.setVisible(true); 
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed
    

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EmpleadoIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmpleadoIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmpleadoIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmpleadoIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmpleadoIngreso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCargarExpediente;
    private javax.swing.JButton btnCargarFoto;
    private javax.swing.JButton btnGuardarEmpleado;
    private javax.swing.JButton btnIngresoFamiliares;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtDpi;
    private javax.swing.JTextField txtFechaContratacion;
    private javax.swing.JTextField txtFechaNacimiento;
    private javax.swing.JTextField txtIdPuesto;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtSueldoBase;
    // End of variables declaration//GEN-END:variables

    private int obtenerIdEmpleado() {
      
    int id = 0; // Valor predeterminado

    // Conectar a la base de datos
    CConexion conexion = new CConexion();
    Connection conn = conexion.establecerConexion();
    if (conn != null) {
        String sql = "SELECT MAX(id_empleado) AS ultimo_id FROM empleado"; // Obtiene el último ID
        try (PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {
            if (rs.next()) {
                id = rs.getInt("ultimo_id"); // Asignar el ID
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al obtener el ID del empleado: " + e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                conn.close(); // Cerrar la conexión
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    return id; // Devolver el ID
}
    }

