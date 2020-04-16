package com.company;

public abstract class Figura {
    private String Color;

    public Figura(){

        this.Color="vacio";

    }
    public Figura(String color) {
        Color = color;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public abstract double CalcularArea();
    public abstract double CalcularPerimetro();


}
