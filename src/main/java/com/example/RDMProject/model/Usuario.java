package com.example.RDMProject.model;

public class Usuario {
    private int idusuario;
    private String usuario;
    private String contrasenia;
    private String nombreCompleto;
    private String email;
    private int rol;

    //Añadir el contructor y el getter and setter
    public Usuario(int idusuario, String usuario, String contrasenia, String nombreCompleto, String email, int rol, int estado) {
        this.idusuario = idusuario;
        this.usuario = usuario;
        this.contrasenia = contrasenia;
        this.nombreCompleto = nombreCompleto;
        this.email = email;
        this.rol = rol;
        this.estado = estado;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getRol() {
        return rol;
    }

    public void setRol(int rol) {
        this.rol = rol;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    private int estado;
}
