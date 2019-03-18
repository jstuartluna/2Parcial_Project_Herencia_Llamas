package com.company;

public class Maestros extends Personas {

    protected String licenciatura;
    protected String maestria;
    protected String doctorado;

    public Maestros(String nombre, String apellido, String numerodecuenta, String identidad, String edad, String licenciatura, String maestria, String doctorado) {
        super(nombre, apellido, numerodecuenta, identidad, edad);
        this.licenciatura = licenciatura;
        this.maestria = maestria;
        this.doctorado = doctorado;
    }

    public String getDoctorado() {
        return doctorado;
    }

    public String getMaestria() {
        return maestria;
    }

    public String getLicenciatura() {
        return licenciatura;
    }

    public void setDoctorado(String doctorado) {
        this.doctorado = doctorado;
    }

    public void setLicenciatura(String licenciatura) {
        this.licenciatura = licenciatura;
    }

    public void setMaestria(String maestria) {
        this.maestria = maestria;
    }
}
