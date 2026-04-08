import java.util.Scanner;

public class vetorex5 {
	public static void main(String[] args) {
		int[] A = new int[10];
		int somaMultiplos5 = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite 10 números inteiros para o vetor A:");
		for (int i = 0; i < 10; i++) {
			System.out.print("A[" + i + "]: ");
			A[i] = sc.nextInt();
			if (A[i] % 5 == 0) {
				somaMultiplos5 += A[i];
			}
		}

		System.out.println("Soma dos elementos múltiplos de 5: " + somaMultiplos5);
		sc.close();
	}
}
