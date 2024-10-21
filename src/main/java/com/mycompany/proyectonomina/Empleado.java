
package com.mycompany.proyectonomina;

import java.time.LocalDate;


public class Empleado {
   
    private int idEmpleado;
    private int idPuesto;
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;
    private float sueldoBase;
    private String dpi;
    private byte[] foto;
    

    public Empleado() {}

    public Empleado(int idPuesto, String nombre, String apellido, LocalDate fechaNacimiento, float sueldoBase, String dpi, byte[] foto) {
        this.idPuesto = idPuesto;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.sueldoBase = sueldoBase;
        this.dpi = dpi;
        this.foto = foto;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public int getIdPuesto() {
        return idPuesto;
    }

    public void setIdPuesto(int idPuesto) {
        this.idPuesto = idPuesto;
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

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public float getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(float sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public String getDpi() {
        return dpi;
    }

    public void setDpi(String dpi) {
        this.dpi = dpi;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }
    
}

    

