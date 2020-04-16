package com.company;

public class Cuadrado extends Rectangulo{
public Cuadrado(){
    super();
    super.setBase(1);
    super.setAltura(1);
}

public Cuadrado(String Color,float lado){
    super();
    super.setColor(Color);
    super.setBase(lado);
    super.setAltura(lado);

}

@Override
    public String toString(){

    return "Color: "+super.getColor()+ " Lado: "+ super.getBase()+ " Perimetro: "+ super.CalcularPerimetro()+ " Area: "+ super.CalcularArea();
}

}
