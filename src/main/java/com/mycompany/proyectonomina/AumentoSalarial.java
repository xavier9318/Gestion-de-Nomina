
package com.mycompany.proyectonomina;

public class AumentoSalarial {
    private int idAumento;
    private int idEmpleado;
    private float monto;
    private String fecha; // Puede ser tipo String o Date

    public AumentoSalarial() {}

    public AumentoSalarial(int idEmpleado, float monto, String fecha) {
        this.idEmpleado = idEmpleado;
        this.monto = monto;
        this.fecha = fecha;
    }

    public int getIdAumento() {
        return idAumento;
    }

    public void setIdAumento(int idAumento) {
        this.idAumento = idAumento;
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

