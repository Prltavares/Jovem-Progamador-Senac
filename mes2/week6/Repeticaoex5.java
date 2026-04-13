package mes2.week6;
import java.util.Scanner;

public class Repeticaoex5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o primeiro número inteiro: ");
		int n1 = sc.nextInt();
		System.out.print("Digite o segundo número inteiro: ");
		int n2 = sc.nextInt();

		int inicio = Math.min(n1, n2) + 1;
		int fim = Math.max(n1, n2);
		int soma = 0;

		System.out.println("Números no intervalo aberto entre " + n1 + " e " + n2 + ":");
		for (int i = inicio; i < fim; i++) {
			System.out.print(i + " ");
			soma += i;
		}
		System.out.println();
		System.out.println("Soma dos números do intervalo: " + soma);
		sc.close();
	}
}
