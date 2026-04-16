public class gastosluzteste {
    public static void main(String[] args) {
        gastosluz leituraJulho = new gastosluz("04/07/2005", 4166, 460, 206.43, "15/07/2005");
        gastosluz leituraAgosto = new gastosluz("02/08/2005", 4201, 350, 157.07, "15/08/2005");

        System.out.println("Resumo da leitura de julho:");
        leituraJulho.mostrarResumo();

        System.out.println("Resumo da leitura de agosto:");
        leituraAgosto.mostrarResumo();

        if (leituraJulho.menorConsumoQue(leituraAgosto)) {
            System.out.println("Julho teve menor consumo que agosto.");
        } else if (leituraJulho.maiorConsumoQue(leituraAgosto)) {
            System.out.println("Julho teve maior consumo que agosto.");
        } else {
            System.out.println("Julho e agosto tiveram o mesmo consumo.");
        }
    }
}
