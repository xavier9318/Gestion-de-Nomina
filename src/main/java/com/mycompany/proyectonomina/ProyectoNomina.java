
package com.mycompany.proyectonomina;

import Interfaz.EmpleadoIngreso;
import com.mycompany.proyectonomina.sql.CConexion;
import javax.swing.SwingUtilities;


public class ProyectoNomina {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                EmpleadoIngreso empleadoIngreso = new EmpleadoIngreso();
                empleadoIngreso.setDefaultCloseOperation(EmpleadoIngreso.EXIT_ON_CLOSE);
                empleadoIngreso.setVisible(true); // Hacer visible la ventana
            }
        });
        CConexion objetoconexion = new CConexion();
        objetoconexion.establecerConexion();
        
    }
}
