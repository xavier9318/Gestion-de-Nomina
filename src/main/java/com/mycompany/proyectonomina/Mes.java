
package com.mycompany.proyectonomina;

public class Mes {
    private int idMes;
    private String nombre;

    public Mes() {}

    public Mes(int idMes, String nombre) {
        this.idMes = idMes;
        this.nombre = nombre;
    }

    public int getIdMes() {
        return idMes;
    }

    public void setIdMes(int idMes) {
        this.idMes = idMes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
