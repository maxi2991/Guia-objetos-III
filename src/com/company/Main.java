package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Cilindro Nuevo= new Cilindro(5,"Azul");
        Cilindro Nuevo2= new Cilindro();
        System.out.println(Nuevo.ImprimirCilindro());
        System.out.println(Nuevo2.ImprimirCilindro());
        System.out.println(Nuevo.toString());
    }
}
