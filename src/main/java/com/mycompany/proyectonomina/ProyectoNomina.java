
package com.mycompany.proyectonomina;

import Interfaz.Dashboard;
import com.mycompany.proyectonomina.sql.CConexion;
import javax.swing.SwingUtilities;


public class ProyectoNomina {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Dashboard dashboard = new Dashboard();
                dashboard.setDefaultCloseOperation(Dashboard.EXIT_ON_CLOSE);
                dashboard.setVisible(true); // Hacer visible la ventana
            }
        });
        CConexion objetoconexion = new CConexion();
        objetoconexion.establecerConexion();
        
    }
}
