package com.company;

public class Alumnos extends Personas {
    protected String carreraestudia;
    protected String numerodecuentaalumno;

    public Alumnos(String nombre, String apellido, String numerodecuenta, String identidad, String edad, String carreraestudia, String numerodecuentaalumno) {
        super(nombre, apellido, numerodecuenta, identidad, edad);
        this.carreraestudia = carreraestudia;
        this.numerodecuentaalumno = numerodecuentaalumno;
    }

    public String getCarreraestudia() {
        return carreraestudia;
    }

    public void setCarreraestudia(String carreraestudia) {
        this.carreraestudia = carreraestudia;
    }

    public String getNumerodecuentaalumno() {
        return numerodecuentaalumno;
    }

    public void setNumerodecuentaalumno(String numerodecuentaalumno) {
        this.numerodecuentaalumno = numerodecuentaalumno;
    }
}
