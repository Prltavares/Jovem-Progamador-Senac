import java.util.Scanner;

public class Lista4_2 {
public static void main(String[] args) {
    Scanner sc = new Scanner( System.in);
    double saldo;
    double reajuste;
    double saldoReajustado;
    
    System.out.println("Digite o saldo:");
    saldo = sc.nextDouble();
    
    reajuste = saldo * 0.01;
    saldoReajustado = saldo + reajuste;
    
    System.out.println("Saldo original: " + saldo);
    System.out.println("Saldo após reajuste de 1%: " + saldoReajustado);
    sc.close();
}
}
