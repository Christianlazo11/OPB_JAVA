package com.item06.Exercise09;

public class Usuario {

    private String nombre;
    private String apellido;
    private int cedula;

    public Usuario() {}

    public Usuario(String nombre, String apellido, int id) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int id) {
        this.cedula = id;
    }
}
