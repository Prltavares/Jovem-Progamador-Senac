public class ContaBancaria {
    protected String nomeCliente;
    protected int numConta;
    protected double saldo;

    public ContaBancaria(String nomeCliente, int numConta, double saldo) {
        this.nomeCliente = nomeCliente;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso!");
        } else {
            System.out.println("Valor de depósito inválido!");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso!");
        } else {
            System.out.println("Saque não permitido! Saldo insuficiente ou valor inválido!");
        }
    }

    public void exibirDados() {
        System.out.println("\n=== Dados da Conta ===");
        System.out.println("Nome do Cliente: " + nomeCliente);
        System.out.println("Número da Conta: " + numConta);
        System.out.println("Saldo: R$ " + String.format("%.2f", saldo));
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public int getNumConta() {
        return numConta;
    }
}