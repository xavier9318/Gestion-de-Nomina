
package com.mycompany.proyectonomina;


public class Vacacion {
 
    private int idVacacion;
    private int idEmpleado;
    private float diasAcumulados;
    private float diasConsumidos;
    private float diasRestantes;
    private String fechaInicio;
    private String fechaUltimaActualizacion;
    
    public Vacacion() {}

        public Vacacion(int idVacacion, int idEmpleado, float diasAcumulados, float diasConsumidos, float diasRestantes, String fechaInicio, String fechaUltimaActualizacion) {
            this.idVacacion = idVacacion;
            this.idEmpleado = idEmpleado;
            this.diasAcumulados = diasAcumulados;
            this.diasConsumidos = diasConsumidos;
            this.diasRestantes = diasRestantes;
            this.fechaInicio = fechaInicio;
            this.fechaUltimaActualizacion = fechaUltimaActualizacion;
        }

    public int getIdVacacion() {
        return idVacacion;
    }

    public void setIdVacacion(int idVacacion) {
        this.idVacacion = idVacacion;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public float getDiasAcumulados() {
        return diasAcumulados;
    }

    public void setDiasAcumulados(float diasAcumulados) {
        this.diasAcumulados = diasAcumulados;
    }

    public float getDiasConsumidos() {
        return diasConsumidos;
    }

    public void setDiasConsumidos(float diasConsumidos) {
        this.diasConsumidos = diasConsumidos;
    }

    public float getDiasRestantes() {
        return diasRestantes;
    }

    public void setDiasRestantes(float diasRestantes) {
        this.diasRestantes = diasRestantes;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaUltimaActualizacion() {
        return fechaUltimaActualizacion;
    }

    public void setFechaUltimaActualizacion(String fechaUltimaActualizacion) {
        this.fechaUltimaActualizacion = fechaUltimaActualizacion;
    }
    
    
    
    }
    
    

