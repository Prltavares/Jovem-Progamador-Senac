package lista2;
public class gastosluz {
    private String dataLeitura;
    private int numeroLeitura;
    private int kwGasto;
    private double valorPagar;
    private String dataPagamento;
    private double mediaConsumo;

    public gastosluz(String dataLeitura, int numeroLeitura, int kwGasto, double valorPagar, String dataPagamento) {
        this.dataLeitura = dataLeitura;
        this.numeroLeitura = numeroLeitura;
        this.kwGasto = kwGasto;
        this.valorPagar = valorPagar;
        this.dataPagamento = dataPagamento;
        calcularMediaConsumo();
    }

    public String getDataLeitura() {
        return dataLeitura;
    }

    public int getNumeroLeitura() {
        return numeroLeitura;
    }

    public int getKwGasto() {
        return kwGasto;
    }

    public double getValorPagar() {
        return valorPagar;
    }

    public String getDataPagamento() {
        return dataPagamento;
    }

    public double getMediaConsumo() {
        return mediaConsumo;
    }

    public void calcularMediaConsumo() {
        this.mediaConsumo = kwGasto / 30.0;
    }

    public boolean menorConsumoQue(gastosluz outro) {
        return this.kwGasto < outro.kwGasto;
    }

    public boolean maiorConsumoQue(gastosluz outro) {
        return this.kwGasto > outro.kwGasto;
    }

    public void mostrarResumo() {
        System.out.println("Data leitura: " + dataLeitura);
        System.out.println("Número de leitura: " + numeroLeitura);
        System.out.println("Kw gasto: " + kwGasto);
        System.out.println("Valor a pagar: R$ " + valorPagar);
        System.out.println("Data pagamento: " + dataPagamento);
        System.out.printf("Média de consumo: %.2f kw/dia\n", mediaConsumo);
        System.out.println();
    }
}
