import java.util.Scanner;

public class Repeticaoex1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int somaPares = 0;
		int produtoImpares = 1;
		boolean temImpar = false;

		System.out.println("Digite números inteiros positivos (0 ou negativo para sair):");
		while (true) {
			System.out.print("Número: ");
			int num = sc.nextInt();
			if (num <= 0) {
				break;
			}
			if (num % 2 == 0) {
				somaPares += num;
			} else {
				produtoImpares *= num;
				temImpar = true;
			}
		}

		System.out.println("Soma dos números pares: " + somaPares);
		if (temImpar) {
			System.out.println("Produto dos números ímpares: " + produtoImpares);
		} else {
			System.out.println("Nenhum número ímpar foi digitado.");
		}
		sc.close();
	}
}
