package com.company;

public class Circulo {
    private double Radio;
    private String Color;
public Circulo(){
    Radio=1;
    Color="Rojo";
}
    public Circulo(double Radio,String Color){
    this.Radio=Radio;
    this.Color=Color;
    }

    public void setRadio(double radio) {
        Radio = radio;
    }

    public void setColor(String color) {
        Color = color;
    }

    public double CalcularArea(){

        return Math.PI*Math.pow(this.Radio,2);

    }

    public double getRadio() {
        return Radio;
    }


    public String getColor() {
        return Color;
    }


@Override
    public String toString(){


        return "Radio: "+this.Radio +" Color: "+this.Color+" Area: "+this.CalcularArea();
    }
}





