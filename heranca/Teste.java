public class Teste {
    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("    SISTEMA DE CONTAS BANCÁRIAS");
        System.out.println("========================================");

        // Criar contas
        ContaBancaria contaNormal = new ContaBancaria("João Silva", 1001, 1000.00);
        ContaPoupanca contaPoupanca = new ContaPoupanca("Maria Santos", 1002, 2000.00, 10);
        ContaEspecial contaEspecial = new ContaEspecial("Pedro Costa", 1003, 500.00, 2000.00);

        // Exibir dados iniciais
        System.out.println("\n--- DADOS INICIAIS DAS CONTAS ---");
        contaNormal.exibirDados();
        contaPoupanca.exibirDados();
        contaEspecial.exibirDados();

        // Realizar saques
        System.out.println("\n--- REALIZANDO SAQUES ---");
        contaNormal.sacar(200.00);
        contaPoupanca.sacar(500.00);
        contaEspecial.sacar(1500.00);

        // Realizar depósitos
        System.out.println("\n--- REALIZANDO DEPÓSITOS ---");
        contaNormal.depositar(300.00);
        contaPoupanca.depositar(1000.00);
        contaEspecial.depositar(800.00);

        // Calcular novo saldo com rendimento (apenas para conta poupança)
        System.out.println("\n--- APLICANDO RENDIMENTO NA CONTA POUPANÇA ---");
        contaPoupanca.calcularNovoSaldo(0.5); // 0.5% ao mês

        // Exibir dados finais
        System.out.println("\n--- DADOS FINAIS DAS CONTAS ---");
        contaNormal.exibirDados();
        contaPoupanca.exibirDados();
        contaEspecial.exibirDados();

        // Teste adicional: tentar sacar mais do que tem em conta normal
        System.out.println("\n--- TESTE DE LIMITE ---");
        System.out.println("Tentando sacar R$ 2000.00 da conta normal...");
        contaNormal.sacar(2000.00);

        System.out.println("\nTentando sacar R$ 3000.00 da conta especial (com limite)...");
        contaEspecial.sacar(3000.00);
        contaEspecial.exibirDados();
    }
}
