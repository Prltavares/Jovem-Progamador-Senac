import java.util.Scanner;

public class vetorex4 {
	public static void main(String[] args) {
		int[] A = new int[10];
		int qtdPares = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite 10 números inteiros para o vetor A:");
		for (int i = 0; i < 10; i++) {
			System.out.print("A[" + i + "]: ");
			A[i] = sc.nextInt();
			if (A[i] % 2 == 0) {
				qtdPares++;
			}
		}

		System.out.println("Quantidade de elementos pares no vetor A: " + qtdPares);
		sc.close();
	}
}
