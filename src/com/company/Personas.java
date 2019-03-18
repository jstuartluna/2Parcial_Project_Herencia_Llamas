package com.company;

public class Personas {
    protected String nombre;
    protected String apellido;
    protected String numerodecuenta;
    protected String identidad;
    protected String edad;

    public Personas(String nombre,String apellido, String numerodecuenta, String identidad, String edad){
        this.apellido = apellido;
        this.nombre = nombre;
        this.numerodecuenta = numerodecuenta;
        this.identidad = identidad;
        this.edad = edad;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEdad() {
        return edad;
    }

    public String getIdentidad() {
        return identidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNumerodecuenta() {
        return numerodecuenta;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public void setIdentidad(String identidad) {
        this.identidad = identidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumerodecuenta(String numerodecuenta) {
        this.numerodecuenta = numerodecuenta;
    }
}
