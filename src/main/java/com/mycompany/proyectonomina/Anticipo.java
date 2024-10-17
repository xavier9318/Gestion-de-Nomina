
package com.mycompany.proyectonomina;


public class Anticipo {
    private int idAnticipo;
    private int idEmpleado;
    private int idPlanilla;
    private float monto;

    public Anticipo() {}

    public Anticipo(int idEmpleado, int idPlanilla, float monto) {
        this.idEmpleado = idEmpleado;
        this.idPlanilla = idPlanilla;
        this.monto = monto;
    }

    public int getIdAnticipo() {
        return idAnticipo;
    }

    public void setIdAnticipo(int idAnticipo) {
        this.idAnticipo = idAnticipo;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public int getIdPlanilla() {
        return idPlanilla;
    }

    public void setIdPlanilla(int idPlanilla) {
        this.idPlanilla = idPlanilla;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }
    
}

