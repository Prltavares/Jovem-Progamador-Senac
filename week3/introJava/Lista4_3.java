
import java.util.Scanner;

public class Lista4_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int resultadoA;
        int resultadoB;
        int resultadomediaA;
        int resultadomediaB;
        int somamedias;
        int mediasaritimericas;

        resultadoA = 8 + 7 + 9;
        resultadoB = 4 + 5 +6; 
        resultadomediaA = resultadoA / 3; 
        resultadomediaB = resultadoB / 3;
        somamedias = resultadomediaA + resultadomediaB;
        mediasaritimericas = somamedias / 2;
        System.out.println("O resultado da media 1 é: " + resultadomediaA);
        System.out.println("O resultado da media 2 é: " + resultadomediaB);
        System.out.println("A soma das médias é: " + somamedias);
        System.out.println("A média aritmética das médias é: " + mediasaritimericas);
    }

}
