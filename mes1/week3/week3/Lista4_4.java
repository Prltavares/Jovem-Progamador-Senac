
import java.util.Scanner;

public class Lista4_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ValorA;
        int ValorB;
        int somavalores;
        int dobrosomavalores;
        System.out.println("Digite o primeiro valor:");
        ValorA = sc.nextInt();
        System.out.println("Digite o segundo valor:");
        ValorB = sc.nextInt();
        somavalores = ValorA + ValorB;
        dobrosomavalores = somavalores * 2;
        System.out.println("A soma dos valores é: " + somavalores);
        System.out.println("O dobro da soma dos valores é: " + dobrosomavalores);
    }

}
