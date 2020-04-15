package com.company;

public class Cilindro extends Circulo {
private double Altura;

public Cilindro(){
    super();
    this.Altura=1;
}

public Cilindro(double Radio, String Color){
    super(Radio,Color);
    this.Altura=1;

}


    public double getAltura() {
        return Altura;
    }

    public void setAltura(double altura) {
        Altura = altura;
    }

    @Override
    public double CalcularArea(){

    return 2*Math.PI*super.getRadio()*Altura+ 2*super.CalcularArea();
    }

    public double CalcularVolumen(){

    return super.CalcularArea()*this.Altura;
    }

    public String ImprimirCilindro(){

    return "Radio de base: "+super.getRadio()+" Altura: "+this.Altura+ " Area de base: "+super.CalcularArea()+ " Volumen: "+this.CalcularVolumen()+ " Area Cilindro: "+this.CalcularArea();

    }
    @Override
    public String toString(){

    return "Cilindro: "+super.toString()+" Altura: "+this.Altura;
    }
}
