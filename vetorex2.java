import java.util.Scanner;

public class vetorex2 {
	public static void main(String[] args) {
		int[] A = new int[10];
		int[] B = new int[10];
		int[] C = new int[10];
		Scanner sc = new Scanner(System.in);

		// Ler os elementos do vetor A
		System.out.println("Digite 10 números inteiros para o vetor A:");
		for (int i = 0; i < 10; i++) {
			System.out.print("A[" + i + "]: ");
			A[i] = sc.nextInt();
			B[i] = A[i] * i;
			C[i] = A[i] % 2;
		}

		// Imprimir o vetor A
		System.out.print("Vetor A: ");
		for (int i = 0; i < 10; i++) {
			System.out.print(A[i] + " ");
		}
		System.out.println();

		// Imprimir o vetor B
		System.out.print("Vetor B: ");
		for (int i = 0; i < 10; i++) {
			System.out.print(B[i] + " ");
		}
		System.out.println();

		// Imprimir o vetor C
		System.out.print("Vetor C: ");
		for (int i = 0; i < 10; i++) {
			System.out.print(C[i] + " ");
		}
		System.out.println();

		sc.close();
	}
}
