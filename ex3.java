public class ex3 {
    public static void main(String[] args) {
        // Guarda os valores
        int a1 = 8, a2 = 9, a3 = 7;
        int b1 = 4, b2 = 5, b3 = 6;

        // Calcula as somas
        int resultado1 = a1 + a2 + a3;
        int resultado2 = b1 + b2 + b3;

        // Calcula as médias
        double resultadomedia1 = resultado1 / 3.0;
        double resultadomedia2 = resultado2 / 3.0;

        // Soma das médias
        double somamedias = resultadomedia1 + resultadomedia2;
        double mediasaritimeticas = somamedias / 2.0;

        // Imprime o resultado
        System.out.println("Média aritmética final: " + mediasaritimeticas);
    }
}
