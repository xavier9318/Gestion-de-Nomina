/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz;

import com.mycompany.proyectonomina.AnticipoService;
import com.mycompany.proyectonomina.EmpleadoCBD;
import javax.swing.JOptionPane;


public class AnticipoSalario extends javax.swing.JFrame {

    

    
    
    public AnticipoSalario() {
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
        btnGenerarAnticipoIndi = new javax.swing.JButton();
        txtCodigoEmpleado = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        txtFecha1 = new javax.swing.JTextField();
        btnGenerarAnticipo1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto Black", 0, 36)); // NOI18N
        jLabel1.setText("Anticipio Quincena");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 310, 40));

        btnGenerarAnticipoIndi.setBackground(new java.awt.Color(153, 153, 153));
        btnGenerarAnticipoIndi.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        btnGenerarAnticipoIndi.setText("Generar Anticipo");
        btnGenerarAnticipoIndi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGenerarAnticipoIndi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarAnticipoIndiActionPerformed(evt);
            }
        });
        jPanel1.add(btnGenerarAnticipoIndi, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 310, -1, -1));

        txtCodigoEmpleado.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.light"));
        txtCodigoEmpleado.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        txtCodigoEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoEmpleadoActionPerformed(evt);
            }
        });
        jPanel1.add(txtCodigoEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 90, 30));

        jLabel3.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel3.setText("General");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 80, 10));

        jLabel4.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        jLabel4.setText("Individual");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 100, 30));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 90, 20));

        jLabel5.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jLabel5.setText("Fecha:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, 60, -1));

        txtFecha1.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.light"));
        txtFecha1.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        txtFecha1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFecha1ActionPerformed(evt);
            }
        });
        jPanel1.add(txtFecha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 60, 90, 30));

        btnGenerarAnticipo1.setBackground(new java.awt.Color(153, 153, 153));
        btnGenerarAnticipo1.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        btnGenerarAnticipo1.setText("Generar Anticipo");
        btnGenerarAnticipo1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGenerarAnticipo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarAnticipo1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnGenerarAnticipo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, -1));

        jLabel6.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jLabel6.setText("Codigo:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 60, 20));

        txtNombre.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.light"));
        txtNombre.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, 200, 30));

        jButton1.setBackground(new java.awt.Color(153, 153, 153));
        jButton1.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 310, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 715, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFecha1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFecha1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFecha1ActionPerformed

    private void btnGenerarAnticipo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarAnticipo1ActionPerformed
        String fecha = txtFecha1.getText().trim();
    
    if (fecha.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, ingrese una fecha válida.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    
    // Crear una instancia del servicio de anticipos
    AnticipoService anticipoService = new AnticipoService();
    
    // Llamar al método para generar anticipos
    anticipoService.generarAnticipos(fecha);
    }//GEN-LAST:event_btnGenerarAnticipo1ActionPerformed

    private void txtCodigoEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoEmpleadoActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Dashboard ventanaprincipal = new Dashboard();
        ventanaprincipal.setVisible(true); 
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnGenerarAnticipoIndiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarAnticipoIndiActionPerformed
        String fecha = txtFecha1.getText().trim();
    String codigoEmpleadoStr = txtCodigoEmpleado.getText().trim();
    
    if (fecha.isEmpty() || codigoEmpleadoStr.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, ingrese una fecha y un ID de empleado válidos.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    
    int idEmpleado;
    try {
        idEmpleado = Integer.parseInt(codigoEmpleadoStr);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "El ID de empleado debe ser un número entero.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    
    // Crear una instancia del servicio de anticipos
    AnticipoService anticipoService = new AnticipoService();
    
    // Llamar al método para generar anticipo para un empleado específico
    anticipoService.generarAnticipoIndividual(fecha, idEmpleado);
    }//GEN-LAST:event_btnGenerarAnticipoIndiActionPerformed

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
            java.util.logging.Logger.getLogger(AnticipoSalario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AnticipoSalario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AnticipoSalario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AnticipoSalario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AnticipoSalario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGenerarAnticipo1;
    private javax.swing.JButton btnGenerarAnticipoIndi;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField txtCodigoEmpleado;
    private javax.swing.JTextField txtFecha1;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
