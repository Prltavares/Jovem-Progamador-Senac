package mes2.week7;



public class questao5 {
    public static void main(String[] args) {
 
        int cuboA[][][] = new int[10][3][5];
        int cuboB[][][] = new int[10][3][5];
        int cuboC[][][] = new int[10][3][5];
 
        int i, j, k;
 
        for(i = 0; i < 10; i++) {
            for(j = 0; j < 3; j++) {
                for(k = 0; k < 5; k++) {
 
                    cuboA[i][j][k] = 2;
                    cuboB[i][j][k] = 3;
 
                    cuboC[i][j][k] = cuboA[i][j][k] + cuboB[i][j][k];
 
                }
            }
        }
 
        for(i = 0; i < 10; i++) {
            System.out.println("Parte " + i);
 
            for(j = 0; j < 3; j++) {
                for(k = 0; k < 5; k++) {
                    System.out.print(cuboC[i][j][k] + " ");
                }
                System.out.println();
            }
 
            System.out.println();
        }
    }
}