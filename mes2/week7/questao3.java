package mes2.week7;

import java.util.Scanner;

public class questao3 {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        String nome1, nome2, nome3, nome4, nome5;

        System.out.println("Digite o primeiro nome!");
        nome1 = sc.nextLine();
        System.out.println("Digite o segundo nome!");
        nome2 = sc.nextLine();
        System.out.println("Digite o terceiro nome!");
        nome3 = sc.nextLine();
        System.out.println("Digite o quarto nome!");
        nome4 = sc.nextLine();
        System.out.println("Digite o quinto nome!");
        nome5 = sc.nextLine();
        System.out.println("Os nomes digitados inversamente são:");
        System.out.println(nome5);
        System.out.println(nome4);
        System.out.println(nome3);
        System.out.println(nome2);
        System.out.println(nome1);
        sc.close();
    }

}
