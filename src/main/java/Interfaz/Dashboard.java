/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz;

import java.net.URL;
import javax.swing.JOptionPane;


public class Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
        
        initComponents();
    
  
    
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuBar4 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuGestionEmpleado = new javax.swing.JMenu();
        mntIngresarEmpleado = new javax.swing.JMenuItem();
        mntSolicitarAusencia = new javax.swing.JMenuItem();
        mntAutorizarAusencia = new javax.swing.JMenuItem();
        mnuGestionNomina = new javax.swing.JMenu();
        mntIngresarComisiones = new javax.swing.JMenuItem();
        mntPrestaciones = new javax.swing.JMenuItem();
        mntAnticipoQuincena = new javax.swing.JMenuItem();
        mntHorasExtras = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        mnuIngresarPrestamo = new javax.swing.JMenuItem();
        mnuEstadoCuenta = new javax.swing.JMenuItem();
        mnuComprasTienda = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jMenu1.setText("File");
        jMenuBar2.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar2.add(jMenu2);

        jMenu3.setText("File");
        jMenuBar3.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar3.add(jMenu4);

        jMenuItem1.setText("jMenuItem1");

        jMenu5.setText("File");
        jMenuBar4.add(jMenu5);

        jMenu6.setText("Edit");
        jMenuBar4.add(jMenu6);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(31767, 31767));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 51, 255));
        jPanel2.setForeground(new java.awt.Color(24, 165, 207));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 620));

        jPanel3.setBackground(new java.awt.Color(177, 210, 240));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 440, 750, 180));

        jLabel1.setFont(new java.awt.Font("Roboto Black", 0, 100)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("T");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 310, 100, 90));

        jLabel2.setFont(new java.awt.Font("Roboto Black", 3, 48)); // NOI18N
        jLabel2.setText("Consulting, S.A.");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 340, 380, 70));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 620));

        jMenuBar1.setBackground(new java.awt.Color(204, 204, 204));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        mnuGestionEmpleado.setBackground(new java.awt.Color(204, 204, 204));
        mnuGestionEmpleado.setText("Gestion Empleado");
        mnuGestionEmpleado.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N

        mntIngresarEmpleado.setBackground(new java.awt.Color(204, 204, 255));
        mntIngresarEmpleado.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        mntIngresarEmpleado.setText("Ingresar Empleado");
        mntIngresarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mntIngresarEmpleadoActionPerformed(evt);
            }
        });
        mnuGestionEmpleado.add(mntIngresarEmpleado);

        mntSolicitarAusencia.setBackground(new java.awt.Color(204, 204, 255));
        mntSolicitarAusencia.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        mntSolicitarAusencia.setText("Solicitar Ausencia");
        mntSolicitarAusencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mntSolicitarAusenciaActionPerformed(evt);
            }
        });
        mnuGestionEmpleado.add(mntSolicitarAusencia);

        mntAutorizarAusencia.setBackground(new java.awt.Color(204, 204, 255));
        mntAutorizarAusencia.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        mntAutorizarAusencia.setText("Autorizar Ausencia");
        mntAutorizarAusencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mntAutorizarAusenciaActionPerformed(evt);
            }
        });
        mnuGestionEmpleado.add(mntAutorizarAusencia);

        jMenuBar1.add(mnuGestionEmpleado);

        mnuGestionNomina.setBackground(new java.awt.Color(204, 204, 204));
        mnuGestionNomina.setText("Gestion Nomina");
        mnuGestionNomina.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N

        mntIngresarComisiones.setBackground(new java.awt.Color(204, 204, 255));
        mntIngresarComisiones.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        mntIngresarComisiones.setText("Ingresar Comisiones");
        mntIngresarComisiones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mntIngresarComisionesActionPerformed(evt);
            }
        });
        mnuGestionNomina.add(mntIngresarComisiones);

        mntPrestaciones.setBackground(new java.awt.Color(204, 204, 255));
        mntPrestaciones.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        mntPrestaciones.setText("Prestaciones");
        mntPrestaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mntPrestacionesActionPerformed(evt);
            }
        });
        mnuGestionNomina.add(mntPrestaciones);

        mntAnticipoQuincena.setBackground(new java.awt.Color(204, 204, 255));
        mntAnticipoQuincena.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        mntAnticipoQuincena.setText("Anticipo Quincena");
        mntAnticipoQuincena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mntAnticipoQuincenaActionPerformed(evt);
            }
        });
        mnuGestionNomina.add(mntAnticipoQuincena);

        mntHorasExtras.setBackground(new java.awt.Color(204, 204, 255));
        mntHorasExtras.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        mntHorasExtras.setText("Horas Extras");
        mntHorasExtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mntHorasExtrasActionPerformed(evt);
            }
        });
        mnuGestionNomina.add(mntHorasExtras);

        jMenuBar1.add(mnuGestionNomina);

        jMenu7.setBackground(new java.awt.Color(204, 204, 204));
        jMenu7.setText("Bancos");
        jMenu7.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N

        mnuIngresarPrestamo.setBackground(new java.awt.Color(204, 204, 255));
        mnuIngresarPrestamo.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        mnuIngresarPrestamo.setText("Ingresar Prestamo");
        mnuIngresarPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuIngresarPrestamoActionPerformed(evt);
            }
        });
        jMenu7.add(mnuIngresarPrestamo);

        mnuEstadoCuenta.setBackground(new java.awt.Color(204, 204, 255));
        mnuEstadoCuenta.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        mnuEstadoCuenta.setText("Estado Cuenta Prestamo");
        mnuEstadoCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuEstadoCuentaActionPerformed(evt);
            }
        });
        jMenu7.add(mnuEstadoCuenta);

        mnuComprasTienda.setBackground(new java.awt.Color(204, 204, 255));
        mnuComprasTienda.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        mnuComprasTienda.setText("Ingreso Compras Tienda");
        mnuComprasTienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuComprasTiendaActionPerformed(evt);
            }
        });
        jMenu7.add(mnuComprasTienda);

        jMenuBar1.add(jMenu7);

        jMenu8.setBackground(new java.awt.Color(204, 204, 204));
        jMenu8.setText("Tools");
        jMenu8.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N

        jMenuItem2.setBackground(new java.awt.Color(204, 204, 255));
        jMenuItem2.setFont(new java.awt.Font("Roboto Medium", 1, 12)); // NOI18N
        jMenuItem2.setText("Crear Usuario");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem2);

        jMenuBar1.add(jMenu8);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mntIngresarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mntIngresarEmpleadoActionPerformed
        EmpleadoIngreso ventanaingresoempleado = new EmpleadoIngreso();
        ventanaingresoempleado.setVisible(true); 
        this.dispose(); 
        
    }//GEN-LAST:event_mntIngresarEmpleadoActionPerformed

    private void mntSolicitarAusenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mntSolicitarAusenciaActionPerformed
        SolicitudDeAusencia ventanasolicitudausencia = new SolicitudDeAusencia();
        ventanasolicitudausencia.setVisible(true); 
        this.dispose();
    }//GEN-LAST:event_mntSolicitarAusenciaActionPerformed

    private void mntAutorizarAusenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mntAutorizarAusenciaActionPerformed
        AutorizarAusencia ventanaautoausencia = new AutorizarAusencia();
        ventanaautoausencia.setVisible(true); 
        this.dispose();
    }//GEN-LAST:event_mntAutorizarAusenciaActionPerformed

    private void mntIngresarComisionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mntIngresarComisionesActionPerformed
        IngresarComisiones ventanaingresarcomisiones = new IngresarComisiones();
        ventanaingresarcomisiones.setVisible(true); 
        this.dispose();
    }//GEN-LAST:event_mntIngresarComisionesActionPerformed

    private void mntPrestacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mntPrestacionesActionPerformed
        PRESTACIONES ventanaprestaciones = new PRESTACIONES();
        ventanaprestaciones.setVisible(true); 
        this.dispose();
    }//GEN-LAST:event_mntPrestacionesActionPerformed

    private void mnuIngresarPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuIngresarPrestamoActionPerformed
        IngresarPrestamo ventanaingresarprestamo = new IngresarPrestamo();
        ventanaingresarprestamo.setVisible(true); 
        this.dispose();
    }//GEN-LAST:event_mnuIngresarPrestamoActionPerformed

    private void mnuEstadoCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuEstadoCuentaActionPerformed
        EstadoDeCuentaPrestamo ventanaestadocuentaprestamo = new EstadoDeCuentaPrestamo();
        ventanaestadocuentaprestamo.setVisible(true); 
        this.dispose();
    }//GEN-LAST:event_mnuEstadoCuentaActionPerformed

    private void mnuComprasTiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuComprasTiendaActionPerformed
        TiendaSolidaria ventanatiendasolidaria = new TiendaSolidaria();
        ventanatiendasolidaria.setVisible(true); 
        this.dispose();
    }//GEN-LAST:event_mnuComprasTiendaActionPerformed

    private void mntAnticipoQuincenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mntAnticipoQuincenaActionPerformed
        AnticipoSalario ventanaanticiposalario = new AnticipoSalario();
        ventanaanticiposalario.setVisible(true); 
        this.dispose();
    }//GEN-LAST:event_mntAnticipoQuincenaActionPerformed

    private void mntHorasExtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mntHorasExtrasActionPerformed
        HorasExtras ventanahorasextras = new HorasExtras();
        ventanahorasextras.setVisible(true); 
        this.dispose();
    }//GEN-LAST:event_mntHorasExtrasActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        CrearUsuario ventanacrearusuario = new CrearUsuario();
        ventanacrearusuario.setVisible(true); 
        this.dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed
    


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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuBar jMenuBar4;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JMenuItem mntAnticipoQuincena;
    private javax.swing.JMenuItem mntAutorizarAusencia;
    private javax.swing.JMenuItem mntHorasExtras;
    private javax.swing.JMenuItem mntIngresarComisiones;
    private javax.swing.JMenuItem mntIngresarEmpleado;
    private javax.swing.JMenuItem mntPrestaciones;
    private javax.swing.JMenuItem mntSolicitarAusencia;
    private javax.swing.JMenuItem mnuComprasTienda;
    private javax.swing.JMenuItem mnuEstadoCuenta;
    private javax.swing.JMenu mnuGestionEmpleado;
    private javax.swing.JMenu mnuGestionNomina;
    private javax.swing.JMenuItem mnuIngresarPrestamo;
    // End of variables declaration//GEN-END:variables
}
