package mes2.week7;

import java.util.Scanner;

public class questao2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int senhaValida = 1234;
        int senha;
        int tentativas = 0;
        do {
            System.out.print("Digite a senha: ");
            senha = sc.nextInt();
            tentativas++;
            if (senha != senhaValida) {
                System.out.println("ACESSO NEGADO");
            }
        } while (senha != senhaValida);
        System.out.println("ACESSO PERMITIDO. Tentativas: " + tentativas);
        sc.close();
    }

}
