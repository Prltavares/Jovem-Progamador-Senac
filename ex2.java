import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o saldo: ");
        double saldo = scanner.nextDouble();

        double reajuste = saldo * 0.01;
        double saldoReajustado = saldo + reajuste;

        System.out.println("Saldo original: " + saldo);
        System.out.println("Saldo após reajuste de 1%: " + saldoReajustado);
        scanner.close();
    }
}
