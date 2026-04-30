package listaextra;

import java.util.Scanner;

public class nadador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a idade do nadador: ");
        int idade = sc.nextInt();   
        
        if (idade >=5 && idade <=7){
            System.out.println("categoria INFANTIL A");
        }else if (idade>=8 && idade <=10){
            System.out.println("categoria INFANTIL B");
        }else if (idade>=11 && idade <=13){
            System.out.println("categoria JUVENIL A");
        }else if (idade>=14 && idade <=17){
            System.out.println("categoria JUVENIL B");
        }else if (idade>=18){
            System.out.println("categoria Adulto");
        }
    }
      
}

    


