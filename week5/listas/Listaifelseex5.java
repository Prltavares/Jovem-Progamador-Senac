package week5.listas;

import java.util.Scanner;

public class Listaifelseex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        double gasolina, etanol,diesel,litros,valorTotal = 0;
        String combustivel;
        
        System.out.println("se hoje você abastecer 30 litros ou mais de etanol, você ganha uma troca de oleo gratis");
        System.out.println("você deseja abastecer com gasolina, etanol ou diesel?");
        combustivel = sc.next();

        System.out.println("quantos litros você deseja abastecer?");
        litros = sc.nextDouble(); 

    gasolina = 2.53;
    etanol = 2.09; 
    diesel = 1.92;
    if (combustivel.equalsIgnoreCase("gasolina")){
        valorTotal = (gasolina * litros);
        System.out.println("o valor total do abastecimento é de R$ " + valorTotal);
    } else if (combustivel.equalsIgnoreCase("etanol")) {
        valorTotal = (etanol * litros);
        System.out.println("o valor total do abastecimento é de R$ " + valorTotal);
        if (litros >= 30) {
            System.out.println("Parabéns você ganhou uma troca de oleo gratis");
        } else {
            System.out.println("infelizmente você não foi elegivel para a troca de oleo gratis");
        }   
    } else if (combustivel.equalsIgnoreCase("diesel")) {
        valorTotal = (diesel * litros);
        System.out.println("o valor total do abastecimento é de R$ " + valorTotal);
    } else {
        System.out.println("combustivel invalido");
        
    }
        
            
    }



}


