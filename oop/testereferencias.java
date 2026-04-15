package oop;
public class testereferencias {
    public static void main(String[] args) {
        carro c1 = new carro();
        c1.marca = "fiat";
        c1.modelo= "ducato";
        carro c2 = new carro();
        c2.marca = "fiat";
        c2.modelo = "ducato";
         if (c1 == c2) {
            System.out.println("são iguais");
        } else {
            System.out.println("são diferentes");
        }    

    }            
}
