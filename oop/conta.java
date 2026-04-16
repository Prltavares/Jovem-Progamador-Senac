package oop;

public class conta {
    public int numero;
    public String titular;
    public double saldo;
    public double limiteChequeEspecial = 400.0;

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    public boolean sacar(double valor) {
        if (valor <= 0) {
            return false;
        }

        if (saldo - valor >= -limiteChequeEspecial) {
            saldo -= valor;
            return true;
        }

        return false;
    }

    public double consultarSaldo() {
        return saldo;
    }

    public boolean estaUsandoChequeEspecial() {
        return saldo < 0;
    }
}	


