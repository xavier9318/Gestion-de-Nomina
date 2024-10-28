
package com.mycompany.proyectonomina;

import Interfaz.Login; // Importar la clase Login
import com.mycompany.proyectonomina.sql.CConexion;
import javax.swing.SwingUtilities;

public class ProyectoNomina {

    public static void main(String[] args) {
        // Crear la conexión a la base de datos
        CConexion objetoconexion = new CConexion();
        objetoconexion.establecerConexion();

        // Iniciar la ventana de Login
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Login login = new Login(); // Cambia Dashboard por Login
                login.setDefaultCloseOperation(Login.EXIT_ON_CLOSE);
                login.setVisible(true); // Hacer visible la ventana de Login
            }
        });
    }
}
