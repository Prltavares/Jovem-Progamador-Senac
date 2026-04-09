import java.util.Random;

public class matrixex4 {
	public static void main(String[] args) {
		int[][] M = new int[10][10];
		Random rand = new Random();

		// Gerar matriz
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				M[i][j] = rand.nextInt(10); // 0 a 9
			}
		}

		// Imprimir matriz
		System.out.println("Matriz 10x10 gerada:");
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print(M[i][j] + " ");
			}
			System.out.println();
		}

		// Linha 5 (índice 4)
		int maiorLinha5 = M[4][0];
		int menorLinha5 = M[4][0];
		for (int j = 1; j < 10; j++) {
			if (M[4][j] > maiorLinha5) maiorLinha5 = M[4][j];
			if (M[4][j] < menorLinha5) menorLinha5 = M[4][j];
		}

		// Coluna 7 (índice 6)
		int maiorColuna7 = M[0][6];
		int menorColuna7 = M[0][6];
		for (int i = 1; i < 10; i++) {
			if (M[i][6] > maiorColuna7) maiorColuna7 = M[i][6];
			if (M[i][6] < menorColuna7) menorColuna7 = M[i][6];
		}

		System.out.println("Maior valor da linha 5: " + maiorLinha5);
		System.out.println("Menor valor da linha 5: " + menorLinha5);
		System.out.println("Maior valor da coluna 7: " + maiorColuna7);
		System.out.println("Menor valor da coluna 7: " + menorColuna7);
	}
}
