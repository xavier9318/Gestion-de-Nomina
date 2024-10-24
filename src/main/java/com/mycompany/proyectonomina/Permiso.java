
package com.mycompany.proyectonomina;

public class Permiso {
    private int idPermiso;
    private String fechaSolicitud;
    private String fechaPermiso;
    private int idEmpleado;
    private int idUsuario;
    private String motivo;
    private int idPlanilla;
    private int idEstado;
    private boolean descontar;
    private float valorDescuento;
    private int idCategoria;


    public Permiso() {}

    public Permiso(String fechaSolicitud, String fechaPermiso, int idEmpleado, int idUsuario, String motivo, int idPlanilla, int idEstado, boolean descontar, float valorDescuento, int idCategoria) {
        this.fechaSolicitud = fechaSolicitud;
        this.fechaPermiso = fechaPermiso;
        this.idEmpleado = idEmpleado;
        this.idUsuario = idUsuario;
        this.motivo = motivo;
        this.idPlanilla = idPlanilla;
        this.idEstado = idEstado;
        this.descontar = descontar;
        this.valorDescuento = valorDescuento;
        this.idCategoria = idCategoria;
    }

    public int getIdPermiso() {
        return idPermiso;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public void setIdPermiso(int idPermiso) {
        this.idPermiso = idPermiso;
    }

    public String getFechaSolicitud() {
        return fechaSolicitud;
    }

    public void setFechaSolicitud(String fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }

    public String getFechaPermiso() {
        return fechaPermiso;
    }

    public void setFechaPermiso(String fechaPermiso) {
        this.fechaPermiso = fechaPermiso;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public int getIdPlanilla() {
        return idPlanilla;
    }

    public void setIdPlanilla(int idPlanilla) {
        this.idPlanilla = idPlanilla;
    }

    public int getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }

    public boolean isDescontar() {
        return descontar;
    }

    public void setDescontar(boolean descontar) {
        this.descontar = descontar;
    }

    public float getValorDescuento() {
        return valorDescuento;
    }

    public void setValorDescuento(float valorDescuento) {
        this.valorDescuento = valorDescuento;
    }
    
}

