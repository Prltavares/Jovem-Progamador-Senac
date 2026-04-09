package week6;
import java.util.Scanner;

public class vetorex1 {
	public static void main(String[] args) {
		int[] A = new int[15];
		int[] B = new int[15];
		Scanner sc = new Scanner(System.in);

		// Ler os elementos do vetor A
		System.out.println("Digite 15 números inteiros para o vetor A:");
		for (int i = 0; i < 15; i++) {
			System.out.print("A[" + i + "]: ");
			A[i] = sc.nextInt();
			B[i] = A[i] * A[i];
		}

		// Imprimir o vetor A
		System.out.print("Vetor A: ");
		for (int i = 0; i < 15; i++) {
			System.out.print(A[i] + " ");
		}
		System.out.println();

		// Imprimir o vetor B
		System.out.print("Vetor B: ");
		for (int i = 0; i < 15; i++) {
			System.out.print(B[i] + " ");
		}
		System.out.println();

		sc.close();
	}
}
