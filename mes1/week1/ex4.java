
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro valor: ");
        int valor1 = scanner.nextInt();
        System.out.print("Digite o segundo valor: ");
        int valor2 = scanner.nextInt();
        int resultado = valor1 + valor2;
       
        int dobrodasoma = resultado * 2;

        System.out.println("A soma dos valores é: " + resultado);
        System.out.println("O dobro da soma dos valores é: " + dobrodasoma);

scanner.close();
    
    }
}
