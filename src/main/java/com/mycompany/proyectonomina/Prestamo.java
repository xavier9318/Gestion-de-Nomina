
package com.mycompany.proyectonomina;


public class Prestamo {
    private int idPrestamo;
    private int idEmpleado;
    private float monto;
    private int plazo; // Ejemplo: 6, 12 o 18 meses
    private float cuotaMensual;
    private String fechaInicio;

    public Prestamo() {}

    public Prestamo(int idEmpleado, float monto, int plazo, float cuotaMensual, String fechaInicio) {
        this.idEmpleado = idEmpleado;
        this.monto = monto;
        this.plazo = plazo;
        this.cuotaMensual = cuotaMensual;
        this.fechaInicio = fechaInicio;
    }

    public int getIdPrestamo() {
        return idPrestamo;
    }

    public void setIdPrestamo(int idPrestamo) {
        this.idPrestamo = idPrestamo;
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

    public int getPlazo() {
        return plazo;
    }

    public void setPlazo(int plazo) {
        this.plazo = plazo;
    }

    public float getCuotaMensual() {
        return cuotaMensual;
    }

    public void setCuotaMensual(float cuotaMensual) {
        this.cuotaMensual = cuotaMensual;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    
}
