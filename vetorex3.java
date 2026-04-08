import java.util.Scanner;

public class vetorex3 {
	public static void main(String[] args) {
		int[] A = new int[10];
		int[] B = new int[10];
		int[] C_soma = new int[10];
		int[] C_sub = new int[10];
		int[] C_mult = new int[10];
		double[] C_div = new double[10];
		Scanner sc = new Scanner(System.in);

		// Ler os elementos do vetor A
		System.out.println("Digite 10 números inteiros para o vetor A:");
		for (int i = 0; i < 10; i++) {
			System.out.print("A[" + i + "]: ");
			A[i] = sc.nextInt();
		}

		// Ler os elementos do vetor B
		System.out.println("Digite 10 números inteiros para o vetor B:");
		for (int i = 0; i < 10; i++) {
			System.out.print("B[" + i + "]: ");
			B[i] = sc.nextInt();
		}

		// Calcular os vetores C
		for (int i = 0; i < 10; i++) {
			C_soma[i] = A[i] + B[i];
			C_sub[i] = A[i] - B[i];
			C_mult[i] = A[i] * B[i];
			if (B[i] != 0) {
				C_div[i] = (double) A[i] / B[i];
			} else {
				C_div[i] = Double.NaN; // ou 0, conforme desejado
			}
		}

		// Imprimir os resultados
		System.out.print("Soma (A+B): ");
		for (int i = 0; i < 10; i++) {
			System.out.print(C_soma[i] + " ");
		}
		System.out.println();

		System.out.print("Subtração (A-B): ");
		for (int i = 0; i < 10; i++) {
			System.out.print(C_sub[i] + " ");
		}
		System.out.println();

		System.out.print("Multiplicação (A*B): ");
		for (int i = 0; i < 10; i++) {
			System.out.print(C_mult[i] + " ");
		}
		System.out.println();

		System.out.print("Divisão (A/B): ");
		for (int i = 0; i < 10; i++) {
			if (Double.isNaN(C_div[i])) {
				System.out.print("NaN ");
			} else {
				System.out.printf("%.2f ", C_div[i]);
			}
		}
		System.out.println();

		sc.close();
	}
}
