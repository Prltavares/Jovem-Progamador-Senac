package week6;
import java.util.Scanner;

public class matrixex5 {
	public static void main(String[] args) {
		int[][] matriz = new int[5][5];
		Scanner sc = new Scanner(System.in);
		int maior = Integer.MIN_VALUE;
		int linhaMaior = -1;
		int colunaMaior = -1;

		System.out.println("Digite os valores para a matriz 5x5 (sem repetição):");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("Elemento [" + i + "][" + j + "]: ");
				matriz[i][j] = sc.nextInt();
				if (matriz[i][j] > maior) {
					maior = matriz[i][j];
					linhaMaior = i;
					colunaMaior = j;    
				}
			}
		}
		sc.close();
		System.out.println("Maior valor: " + maior);
		System.out.println("Localização: linha " + linhaMaior + ", coluna " + colunaMaior);
	}
}
