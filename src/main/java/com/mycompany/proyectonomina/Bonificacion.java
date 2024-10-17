
package com.mycompany.proyectonomina;


public class Bonificacion {
    private int idBonificacion;
    private int idEmpleado;
    private float monto;
    private String fecha;

    public Bonificacion() {}

    public Bonificacion(int idEmpleado, float monto, String fecha) {
        this.idEmpleado = idEmpleado;
        this.monto = monto;
        this.fecha = fecha;
    }

    public int getIdBonificacion() {
        return idBonificacion;
    }

    public void setIdBonificacion(int idBonificacion) {
        this.idBonificacion = idBonificacion;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
}

