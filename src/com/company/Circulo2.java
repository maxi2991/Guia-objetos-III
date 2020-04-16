package com.company;

public class Circulo2 extends Figura {
    private double Radio;

    public Circulo2(){
        super();
        this.Radio=1;
    }

    public Circulo2(String color, double radio){

        super(color);
        this.Radio=radio;
    }

    public double getRadio() {
        return Radio;
    }

    public void setRadio(double radio) {
        Radio = radio;
    }

    @Override
    public double CalcularArea(){

        return Math.PI*Math.pow(Radio,2);
    }

    @Override
    public double CalcularPerimetro(){
        return 2*Math.PI*Radio;
    }

    @Override
    public String toString(){

        return "Color: "+super.getColor()+ " Radio: "+Radio+" Area: "+this.CalcularArea() + " Perimetro: "+ this.CalcularPerimetro();
    }

}
