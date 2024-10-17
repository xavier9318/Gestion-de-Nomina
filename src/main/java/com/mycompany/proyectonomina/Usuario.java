
package com.mycompany.proyectonomina;

public class Usuario {
    private int idUsuario;
    private String nombre;
    private String usuario;
    private String password;
    private int idEstado;
    private int idRol;

    public Usuario() {}

    public Usuario(String nombre, String usuario, String password, int idEstado, int idRol) {
        this.nombre = nombre;
        this.usuario = usuario;
        this.password = password;
        this.idEstado = idEstado;
        this.idRol = idRol;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }

    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }
    
}

