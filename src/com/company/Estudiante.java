package com.company;

public class Estudiante extends Persona {
    private int Año;
    private float cuotaMensual;
    private String Carrera;

    public Estudiante(int dni, String name, String apellido, String email, String direccion,int año , float cuota , String carrera) {
        super(dni, name, apellido, email, direccion);
        this.Carrera=carrera;
        this.Año=año;
        this.cuotaMensual=cuota;
    }

    public int getAño() {
        return Año;
    }

    public void setAño(int año) {
        Año = año;
    }

    public float getCuotaMensual() {
        return cuotaMensual;
    }

    public void setCuotaMensual(float cuotaMensual) {
        this.cuotaMensual = cuotaMensual;
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String carrera) {
        Carrera = carrera;
    }

    @Override
    public String toString() {
        return super.toString()+ "Año: "+ Año + " Cuota mensual: "+ cuotaMensual + " Carrera: "+ Carrera;
    }
}
