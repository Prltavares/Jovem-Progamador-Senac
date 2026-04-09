package week6;
import java.util.Scanner;

public class matrixex3 {
	public static void main(String[] args) {
		int[][] M = new int[3][3];
		int pares = 0;
		int impares = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite os valores para a matriz 3x3:");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("Elemento [" + i + "][" + j + "]: ");
				M[i][j] = sc.nextInt();
				if (M[i][j] % 2 == 0) {
					pares++;
				} else {
					impares++;
				}
			}
		}

		System.out.println("Matriz criada:");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(M[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("Quantidade de números pares: " + pares);
		System.out.println("Quantidade de números ímpares: " + impares);
		sc.close();
	}
}
