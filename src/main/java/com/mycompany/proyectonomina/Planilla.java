
package com.mycompany.proyectonomina;


public class Planilla {
    private int idPlanilla;
    private int numeroQuincena;
    private int idMes;
    private String desde;
    private String hasta;
    private int idEstado;

    public Planilla() {}

    public Planilla(int numeroQuincena, int idMes, String desde, String hasta, int idEstado) {
        this.numeroQuincena = numeroQuincena;
        this.idMes = idMes;
        this.desde = desde;
        this.hasta = hasta;
        this.idEstado = idEstado;
    }

    public int getIdPlanilla() {
        return idPlanilla;
    }

    public void setIdPlanilla(int idPlanilla) {
        this.idPlanilla = idPlanilla;
    }

    public int getNumeroQuincena() {
        return numeroQuincena;
    }

    public void setNumeroQuincena(int numeroQuincena) {
        this.numeroQuincena = numeroQuincena;
    }

    public int getIdMes() {
        return idMes;
    }

    public void setIdMes(int idMes) {
        this.idMes = idMes;
    }

    public String getDesde() {
        return desde;
    }

    public void setDesde(String desde) {
        this.desde = desde;
    }

    public String getHasta() {
        return hasta;
    }

    public void setHasta(String hasta) {
        this.hasta = hasta;
    }

    public int getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }
    
}
