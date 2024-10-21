
package com.mycompany.proyectonomina;


public class Parentezco {
    private int idParentezco;
    private String descripcion;

    public Parentezco() {}

    public Parentezco(int idParentezco, String descripcion) {
        this.idParentezco = idParentezco;
        this.descripcion = descripcion;
    }

    public int getIdParentezco() {
        return idParentezco;
    }

    public void setIdParentezco(int idParentezco) {
        this.idParentezco = idParentezco;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}

