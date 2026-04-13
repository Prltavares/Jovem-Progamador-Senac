package mes2.week6;

import java.util.Scanner;

public class Listaifelseex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int codigo =0; 
        System.out.println("Digite o codigo do produto");
        codigo = sc.nextInt();
        switch (codigo) {
            case 1:
                System.out.println("Alimento não perecível");
                break;
            case 2:
                System.out.println("Alimento perecível");
                break;
            case 3:
                System.out.println("Vestuário");
                break;
            case 4:
                System.out.println("Higiene pessoal");
                break;
            case 5:
                System.out.println("Limpeza e utensílios domésticos");
                break;
        
            default:
                System.out.println("Codigo de produto inválido");
        }
    
    sc.close();

    }

}
