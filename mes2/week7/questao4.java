package mes2.week7;

public class questao4 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        double[][] A = new double[4][2];
        double[][] B = new double[4][2];

        System.out.print("Digite o valor de X: ");
        double X = sc.nextDouble();

        // Leitura da matriz A  
        System.out.println("Digite os elementos da matriz A (4x2):");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("A[" + i + "][" + j + "]: ");
                A[i][j] = sc.nextDouble();
            }
        }

        // Calcula matriz B
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                B[i][j] = A[i][j] / X;
            }
        }

        // Exibe matriz B
        System.out.println("Matriz B (A dividida por X):");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(B[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }

}
