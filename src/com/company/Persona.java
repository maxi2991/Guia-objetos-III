package com.company;

public class Persona {
private int Dni;
private String Name;
private String Apellido;
private String Email;
private String Direccion;

public Persona(int dni, String name, String apellido, String email, String direccion ){

    this.Dni=dni;
    this.Apellido=apellido;
    this.Name=name;
    this.Email=email;
    this.Direccion=direccion;
}

    public int getDni() {
        return Dni;
    }

    public void setDni(int dni) {
        Dni = dni;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    @Override
    public String toString() {
        return "Miembro: "+Name+ " Apellido:  "+ Apellido+ " Dni: "+ Dni+ " Direccion: "+ Direccion + " mail: "+Email;
    }
}
