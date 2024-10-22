
package com.mycompany.proyectonomina;


public class Familiar {
    private int idFamiliar;
    private int idEmpleado;
    private String nombre;
    private String apellido;
    private String telefono;
    private int idParentezco;

    public Familiar() {}

    public Familiar(int idEmpleado, String nombre, String apellido, String telefono, int idParentezco) {
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.idParentezco = idParentezco;
    }

    public int getIdFamiliar() {
        return idFamiliar;
    }

    public void setIdFamiliar(int idFamiliar) {
        this.idFamiliar = idFamiliar;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getIdParentezco() {
        return idParentezco;
    }

    public void setIdParentezco(int idParentezco) {
        this.idParentezco = idParentezco;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
}


