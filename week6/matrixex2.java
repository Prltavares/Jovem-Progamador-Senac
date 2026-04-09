package week6;
import java.util.Random;

public class matrixex2 {
	public static void main(String[] args) {
		int[][] M = new int[4][4];
		Random numeroRandom = new Random();
		int maior = Integer.MIN_VALUE;
		int linhaMaior = -1;
		int colunaMaior = -1;

		System.out.println("Matriz 4x4 gerada:");
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				M[i][j] = numeroRandom.nextInt(10); // 0 a 9
				System.out.print(M[i][j] + " ");
				if (M[i][j] > maior) {
					maior = M[i][j];
					linhaMaior = i;
					colunaMaior = j;
				}
			}
			System.out.println();
		}
		System.out.println("Maior valor: " + maior);
		System.out.println("Posição: linha " + linhaMaior + ", coluna " + colunaMaior);
	}
}
