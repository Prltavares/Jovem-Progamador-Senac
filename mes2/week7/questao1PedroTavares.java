package mes2.week7;

import java.util.Scanner;

public class questao1PedroTavares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual é o valor do produto 1?");
        double produto1 = sc.nextDouble();
        System.out.println("Qual é o valor do produto 2?");
        double produto2 = sc.nextDouble();
        System.out.println("Qual é o valor do produto 3?");
        double produto3 = sc.nextDouble();

        if (produto1 <= produto2 && produto1 <= produto3) {
            System.out.println("Você deve comprar o produto 1, que custa R$ " + produto1);
        } else if (produto2 <= produto1 && produto2 <= produto3) {
            System.out.println("Você deve comprar o produto 2, que custa R$ " + produto2);
        } else {
            System.out.println("Você deve comprar o produto 3, que custa R$ " + produto3);
        }

        sc.close();
    }

}
