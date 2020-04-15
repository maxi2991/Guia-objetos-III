package com.company;

public class Circulo {
    private double Radio=1;
    private String Color="Rojo";

    public Circulo(double Radio,String Color){
    this.Radio=Radio;
    this.Color=Color;
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



    public String ImprimirCirculo(){


        return "Radio: "+this.Radio +" Color: "+this.Color+" Area: "+this.CalcularArea();
    }
}





