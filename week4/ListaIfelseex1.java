package week4;

import java.util.Scanner;

public class ListaIfelseex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0;

        System.out.println("Digite um número inteiro:");
        numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é ímpar.");
        }
        sc.close();
    }
   
}
