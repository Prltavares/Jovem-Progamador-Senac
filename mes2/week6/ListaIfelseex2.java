package mes2.week6;


import java.util.Scanner;

public class ListaIfelseex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        int numero = 0;

    System.out.println("Digite um número");
    numero = sc.nextInt();
    if (numero > 0) {
        System.out.println("o numero é positivo");
         } else if ( numero < 0) {
            System.out.println("o numero é negativo");
        } else { 
            System.out.println("o numero é neutro");
        
        }
    }

}

