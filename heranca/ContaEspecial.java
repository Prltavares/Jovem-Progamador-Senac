public class ContaEspecial extends ContaBancaria {
    private double limite;

    public ContaEspecial(String nomeCliente, int numConta, double saldo, double limite) {
        super(nomeCliente, numConta, saldo);
        this.limite = limite;
    }

    @Override
    public void sacar(double valor) {
        if (valor > 0 && valor <= (this.saldo + this.limite)) {
            this.saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso!");
            if (this.saldo < 0) {
                System.out.println("Atenção! Você está usando o limite da conta.");
                System.out.println("Saldo em débito: R$ " + String.format("%.2f", this.saldo));
            }
        } else {
            System.out.println("Saque não permitido! Limite insuficiente ou valor inválido!");
        }
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getSaldoDisponivel() {
        return this.saldo + this.limite;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Limite: R$ " + String.format("%.2f", limite));
        System.out.println("Saldo Disponível: R$ " + String.format("%.2f", getSaldoDisponivel()));
    }
}
