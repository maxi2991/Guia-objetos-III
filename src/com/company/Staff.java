package com.company;

public class Staff extends Persona {
    private float Salario;
    private String Turno;

    public Staff(int dni, String name, String apellido, String email, String direccion, float salario , String turno) {
        super(dni, name, apellido, email, direccion);
        this.Salario=salario;
        this.Turno=turno;
    }

    public float getSalario() {
        return Salario;
    }

    public void setSalario(float salario) {
        Salario = salario;
    }

    public String getTurno() {
        return Turno;
    }

    public void setTurno(String turno) {
        Turno = turno;
    }

    public float getSalarioAnual(){
        return 12*this.Salario;
    }

    @Override
    public String toString() {
        return super.toString()+ "turno: "+ Turno + " Salario: "+ Salario + " Salario Anual: "+ this.getSalarioAnual();
    }
}
