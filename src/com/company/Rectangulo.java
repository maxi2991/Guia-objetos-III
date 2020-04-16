package com.company;

public class Rectangulo extends Figura {
    private float Base;
    private float Altura;

    public Rectangulo(){
        super();
        this.Altura=1;
        this.Base=1;
    }

    public Rectangulo(String color,float base, float altura){
        super(color);
        this.Base=base;
        this.Altura=altura;

    }

    public float getBase() {
        return Base;
    }

    public void setBase(float base) {
        Base = base;
    }

    public float getAltura() {
        return Altura;
    }

    public void setAltura(float altura) {
        Altura = altura;
    }

    @Override
    public double CalcularArea(){

        return Base*Altura;
    }

    @Override
    public double CalcularPerimetro(){
        return 2*Base+2*Altura;
    }

    @Override
    public String toString(){

    return "Color: "+super.getColor()+ " Base:  "+ Base+" Altura: "+Altura+" Area: "+this.CalcularArea() + " Perimetro: "+ this.CalcularPerimetro();
    }
}
