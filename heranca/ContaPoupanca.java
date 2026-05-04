public class ContaPoupanca extends ContaBancaria {
    private int diaRendimento;

    public ContaPoupanca(String nomeCliente, int numConta, double saldo, int diaRendimento) {
        super(nomeCliente, numConta, saldo);
        this.diaRendimento = diaRendimento;
    }

    public void calcularNovoSaldo(double taxaRendimento) {
        if (taxaRendimento > 0) {
            double rendimento = this.saldo * (taxaRendimento / 100);
            this.saldo += rendimento;
            System.out.println("Rendimento de R$ " + String.format("%.2f", rendimento) + " adicionado à conta!");
            System.out.println("Novo saldo: R$ " + String.format("%.2f", this.saldo));
        } else {
            System.out.println("Taxa de rendimento inválida!");
        }
    }

    public int getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Dia do Rendimento: " + diaRendimento);
    }
}
