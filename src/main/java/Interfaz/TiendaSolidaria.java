/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz;

import com.mycompany.proyectonomina.Empleado;
import com.mycompany.proyectonomina.EmpleadoCBD;
import javax.swing.JOptionPane;


public class TiendaSolidaria extends javax.swing.JFrame {

    /**
     * Creates new form TiendaSolidaria
     */
    public TiendaSolidaria() {
        initComponents();
        
        txtCodigoEmpleado.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cargarNombreEmpleado();
              }
        });
        
    }
    private void cargarNombreEmpleado() {
        try {
        int idEmpleado = Integer.parseInt(txtCodigoEmpleado.getText().trim());
        String nombreCompleto = EmpleadoCBD.obtenerNombreCompleto(idEmpleado);
        

        if (!nombreCompleto.trim().isEmpty()) {
            txtNombre.setText(nombreCompleto);
          
        } else {
            JOptionPane.showMessageDialog(this, "Empleado no encontrado.");
            txtNombre.setText("");
            
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Por favor ingrese un ID de empleado válido.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCodigoEmpleado = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtNombre = new javax.swing.JTextPane();
        jLabel3 = new javax.swing.JLabel();
        txtFechaCompra = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtMontoCompra = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cmbPlazoCredito = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        txtLimiteCredito = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto Black", 0, 36)); // NOI18N
        jLabel1.setText("CONSUMO TIENDA");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, 34));

        jLabel2.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jLabel2.setText("Codigo de Empleado:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 150, -1));

        txtCodigoEmpleado.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.light"));
        txtCodigoEmpleado.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jPanel1.add(txtCodigoEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 73, -1));

        txtNombre.setEditable(false);
        txtNombre.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.light"));
        txtNombre.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jScrollPane1.setViewportView(txtNombre);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(264, 60, 270, -1));

        jLabel3.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jLabel3.setText("Ingresar Fecha Compra: ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 178, 170, -1));

        txtFechaCompra.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.light"));
        txtFechaCompra.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jPanel1.add(txtFechaCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 107, -1));

        jLabel4.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jLabel4.setText("Monto de Compra:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 218, 140, -1));

        txtMontoCompra.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.light"));
        txtMontoCompra.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jPanel1.add(txtMontoCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 107, -1));

        jLabel5.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jLabel5.setText("Plazo de credito:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 256, 130, -1));

        cmbPlazoCredito.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        cmbPlazoCredito.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 MES", "2 MESES", "3 MESES", "4 MESES", "5 MESES", "6 MESES" }));
        cmbPlazoCredito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPlazoCreditoActionPerformed(evt);
            }
        });
        jPanel1.add(cmbPlazoCredito, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 110, -1));

        jLabel6.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jLabel6.setText("Limite de Credito:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 127, 130, -1));

        btnCalcular.setBackground(new java.awt.Color(153, 153, 153));
        btnCalcular.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        jPanel1.add(btnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 100, -1));

        jTextPane2.setEditable(false);
        jTextPane2.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.light"));
        jTextPane2.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        txtLimiteCredito.setViewportView(jTextPane2);

        jPanel1.add(txtLimiteCredito, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 75, -1));

        jButton2.setBackground(new java.awt.Color(153, 153, 153));
        jButton2.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        jButton2.setText("Ingresar Compra");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 372, 190, -1));

        jButton3.setBackground(new java.awt.Color(153, 153, 153));
        jButton3.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        jButton3.setText("Regresar");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 372, 150, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbPlazoCreditoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPlazoCreditoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbPlazoCreditoActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Dashboard ventanaprincipal = new Dashboard();
        ventanaprincipal.setVisible(true); 
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        // Obtener el ID del empleado ingresado
   /** int idEmpleado = Integer.parseInt(txtCodigoEmpleado.getText().trim());

    // Obtener el empleado (deberás implementar este método para obtener el objeto de empleado)
    Empleado empleado = EmpleadoCBD.obtenerEmpleado(idEmpleado);
    
    if (empleado != null) {
        // Verificar si el empleado tiene un préstamo
        boolean tienePrestamo = EmpleadoCBD.tienePrestamo(idEmpleado);
        double limiteCredito;

        if (tienePrestamo) {
            limiteCredito = 200.00; // Límite si tiene préstamo
        } else {
            limiteCredito = empleado.getSalarioBase() * 0.80; // 80% del sueldo base
        }

        // Mostrar el límite de crédito en un campo de texto o en un mensaje
        JOptionPane.showMessageDialog(this, "El límite de crédito es: Q." + limiteCredito);
    } else {
        JOptionPane.showMessageDialog(this, "Empleado no encontrado.");
    }*/
    }//GEN-LAST:event_btnCalcularActionPerformed

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
            java.util.logging.Logger.getLogger(TiendaSolidaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TiendaSolidaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TiendaSolidaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TiendaSolidaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TiendaSolidaria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JComboBox<String> cmbPlazoCredito;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane2;
    private javax.swing.JTextField txtCodigoEmpleado;
    private javax.swing.JTextField txtFechaCompra;
    private javax.swing.JScrollPane txtLimiteCredito;
    private javax.swing.JTextField txtMontoCompra;
    private javax.swing.JTextPane txtNombre;
    // End of variables declaration//GEN-END:variables
}
