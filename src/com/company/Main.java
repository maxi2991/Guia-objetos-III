package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //ejercicio 1
       /* Cilindro Nuevo= new Cilindro(5,"Azul");
        Cilindro Nuevo2= new Cilindro();
        System.out.println(Nuevo.ImprimirCilindro());
        System.out.println(Nuevo2.ImprimirCilindro());
        System.out.println(Nuevo.toString());*/

       // ejercicio 2
       /* int cantEstudiantes=0;
        int cantStaff=0;
        float Ingresos=0;
        Estudiante Nuevo= new Estudiante(46442504,"Matias", "Zarabia","matiyo@gmail.com","alvear 456",2016,2500,"TUP" );
        Estudiante Nuevo2= new Estudiante(44552504,"Marcos", "Zaracho","marquisyo@gmail.com","sarratea 456",2014,2100,"INV OP" );
        Estudiante Nuevo3= new Estudiante(22442504,"Maria", "Flores","mflores@gmail.com","Pescadores 456",2018,3100,"Contable" );
        Estudiante Nuevo4= new Estudiante(36442504,"Sebastian", "Perez","sebaperez@gmail.com","Italia 456",2011,2700,"Grafico" );
        Staff Nuevo5=new Staff(22504555,"Gonzalo","Fernandez","gonzafernandez@gmail.com","España 414",45000,"Tarde");
        Staff Nuevo6=new Staff(12504555,"Eduardo","Viale","Eviale@gmail.com","Jujuy 414",15000,"Noche");
        Staff Nuevo7=new Staff(32504555,"Lucia","Victoris","luciavick@gmail.com","Gascon 411",50000,"mañana");
        Staff Nuevo8=new Staff(14504555,"Guadalupe","Rivas","guadarivas@gmail.com","Moron 420",25500,"Tarde");

        Persona[] Personas= {Nuevo,Nuevo2,Nuevo3,Nuevo4,Nuevo5,Nuevo6,Nuevo7,Nuevo8};

        for( Persona Per: Personas){

            if(Per instanceof Estudiante){
                cantEstudiantes++;
                Ingresos+=((Estudiante) Per).getCuotaMensual();

            }else{

                if(Per instanceof Staff)
                    cantStaff++;
            }


        }

        System.out.println("La cantidad de estudiantes es:  "+cantEstudiantes+ " Cantidad de STaff : " + cantStaff );
        System.out.println("Inresos totales: "+Ingresos);
*/

       //ejercicio 3

        Rectangulo rectangulito=new Rectangulo("Rojo",5,3);
        Circulo2   Radondo= new Circulo2("Azul",6);
        Cuadrado Cuadradito=new Cuadrado("Violeta",4.5f);

        System.out.println(rectangulito.toString());
        System.out.println(Radondo.toString());
        System.out.println(Cuadradito.toString());
}
}
