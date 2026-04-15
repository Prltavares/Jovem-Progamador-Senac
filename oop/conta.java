package oop;
import java.util.Scanner;

public class conta {
    public static void main(String[] args) {
        
    
    Scanner scanner = new Scanner(System.in);
    int numeroConta;
    System.out.print("Digite o número da conta: ");
    numeroConta = scanner.nextInt();
    double saldo;
    System.out.print("Digite o saldo da conta: ");
    saldo = scanner.nextDouble();
    String tipoConta; 
    System.out.print("Digite o tipo da conta (corrente/poupanca): ");
    tipoConta = scanner.nextLine();
    double limite;
    System.out.print("Digite o limite da conta: ");
    limite = scanner.nextDouble();
    

    }

}
