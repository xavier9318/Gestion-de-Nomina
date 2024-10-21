
package com.mycompany.proyectonomina;


public class CompraSolidarista {
    private int idCompra;
    private int idEmpleado;
    private float monto;
    private String fecha;
    private int plazo; // Plazo máximo 6 meses

    public CompraSolidarista() {}

    public CompraSolidarista(int idEmpleado, float monto, String fecha, int plazo) {
        this.idEmpleado = idEmpleado;
        this.monto = monto;
        this.fecha = fecha;
        this.plazo = plazo;
    }

    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
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

    public int getPlazo() {
        return plazo;
    }

    public void setPlazo(int plazo) {
        this.plazo = plazo;
    }
    
}
