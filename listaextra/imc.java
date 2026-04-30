package listaextra;

import java.util.Scanner;

public class imc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o peso em kg: ");
        double peso = sc.nextDouble();
        System.out.println("Digite a altura em metros: ");
        double altura = sc.nextDouble();

        double imc = peso / (altura * altura);

       

        if (imc < 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc >= 18.5 && imc < 25) {
            System.out.println("Peso normal");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("acima do peso");
        } else {
            System.out.println("obeso");
        }

          System.out.println("O IMC é: " + imc);

          sc.close();
    }


}
