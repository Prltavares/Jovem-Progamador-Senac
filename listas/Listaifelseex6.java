package listas;          

import java.util.Scanner;

public class Listaifelseex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int laranja = 60,morango = 20,limao = 80;
        double valorLaranja, valorMorango, valorLimao;
        String fruta;
        System.out.println("qual fruta você deseja comprar? laranja, morango ou limão");
        fruta = sc.next();
        System.out.println("informe o valor unitario da laranja, morango e limão");
        valorLaranja = sc.nextDouble();
        valorMorango = sc.nextDouble();
        valorLimao = sc.nextDouble();
        if (fruta.equalsIgnoreCase("laranja")) {
            System.out.println("o valor da laranja é de R$ " + valorLaranja);
        } else if (fruta.equalsIgnoreCase("morango")) {
            System.out.println("o valor do morango é de R$ " + valorMorango);
        } else if (fruta.equalsIgnoreCase("limão")) {
            System.out.println("o valor do limão é de R$ " + valorLimao);
        } else {
            System.out.println("fruta inválida");
        }


        
    }

}
