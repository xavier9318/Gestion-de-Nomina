
package com.mycompany.proyectonomina;

public class Comision {
    private int idComision;
    private int idEmpleado;
    private int idPlanilla;
    private float monto;
    private String fecha;

    public Comision() {}

    public Comision(int idEmpleado, int idPlanilla, float monto, String fecha) {
        this.idEmpleado = idEmpleado;
        this.idPlanilla = idPlanilla;
        this.monto = monto;
        this.fecha = fecha;
    }

    public int getIdComision() {
        return idComision;
    }

    public void setIdComision(int idComision) {
        this.idComision = idComision;
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

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
}

