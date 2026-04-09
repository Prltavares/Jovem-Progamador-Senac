package test;
import java.util.Scanner;

public class matrixex1 {
	public static void main(String[] args) {
		double[][] matriz = new double[4][3];
		double somaPositivos = 0;
		double somaNegativos = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite os valores para a matriz 4x3:");
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("Elemento [" + i + "][" + j + "]: ");
				matriz[i][j] = sc.nextDouble();
				if (matriz[i][j] > 0) {
					somaPositivos += matriz[i][j];
				} else if (matriz[i][j] < 0) {
					somaNegativos += matriz[i][j];
				}
			}
		}
		sc.close();
		System.out.println("Soma dos números positivos: " + somaPositivos);
		System.out.println("Soma dos números negativos: " + somaNegativos);
	}
}
