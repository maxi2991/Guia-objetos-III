package com.company;

public class Cilindro extends Circulo {
private double Altura=1;

public Cilindro(double Radio, String Color,  double altura){
    super(Radio,Color);
    this.Altura=altura;
}


    public double getAltura() {
        return Altura;
    }

    public void setAltura(double altura) {
        Altura = altura;
    }

    public double CalcularVolumen(){

    return Math.PI*Math.pow(super.getRadio(),2)*this.Altura;
    }

    public String ImprimirCilindro(){

    return "Radio de base: "+super.getRadio()+" Altura: "+this.Altura+ " Area de base: "+super.CalcularArea()+ " Volumen: "+this.CalcularVolumen();

    }
}
