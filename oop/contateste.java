package oop;

public class contateste {
    public static void main(String[] args) {
        conta contaCliente = new conta();
        contaCliente.numero = 3333;
        contaCliente.titular = "Pedro";
        contaCliente.saldo = 200.00;

        System.out.println("Número da Conta: " + contaCliente.numero);
        System.out.println("Titular: " + contaCliente.titular);
        System.out.println("Saldo inicial: R$ " + contaCliente.consultarSaldo());

        contaCliente.depositar(150.00);
        System.out.println("Após depósito: R$ " + contaCliente.consultarSaldo());

        boolean saqueRealizado = contaCliente.sacar(200.00);
        System.out.println("Saque de R$ 200,00 " + (saqueRealizado ? "realizado" : "não realizado"));
        System.out.println("Saldo após saque: R$ " + contaCliente.consultarSaldo());
        System.out.println("Usando cheque especial? " + (contaCliente.estaUsandoChequeEspecial() ? "Sim" : "Não"));

        saqueRealizado = contaCliente.sacar(500.00);
        System.out.println("Saque de R$ 500,00 " + (saqueRealizado ? "realizado" : "não realizado"));
        System.out.println("Saldo final: R$ " + contaCliente.consultarSaldo());
        System.out.println("Usando cheque especial? " + (contaCliente.estaUsandoChequeEspecial() ? "Sim" : "Não"));
    }
}
