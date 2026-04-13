
package mes2.week5;
import java.util.Scanner;

public class Listajava2exe4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite a quantidade de folhas do livro: ");
		int folhas = scanner.nextInt();
		double valorPorCopia = 0.08;
		double valorTotal = folhas * valorPorCopia;
		System.out.printf("Valor total a ser pago: R$ %.2f\n", valorTotal);
		scanner.close();
	}
}
