package oopweek2;

public class contacorrente {
	
	private int numero;
	private double saldo;
	private boolean especial;
	private double limite;

	
	public contacorrente() {
		this.numero = 0;
		this.saldo = 0.0;
		this.especial = false;
		this.limite = 0.0;
	}

	
	public contacorrente(int numero, double saldo, boolean especial, double limite) {
		this.numero = numero;
		this.saldo = saldo;
		this.especial = especial;
		this.limite = limite;
	}

	
	public contacorrente(int numero, boolean especial, double limite) {
		this(numero, 0.0, especial, limite);
	}

	
	public boolean sacar(double valor) {
		if (valor <= 0) return false;
		if (this.saldo + this.limite >= valor) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}

	public void depositar(double valor) {
		if (valor > 0) {
			this.saldo += valor;
		}
	}

	public double consultarSaldo() {
		return this.saldo;
	}

	public boolean usandoChequeEspecial() {
		return this.saldo < 0;
	}

	
	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean isEspecial() {
		return this.especial;
	}

	public void setEspecial(boolean especial) {
		this.especial = especial;
	}

	public double getLimite() {
		return this.limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	
	private void mostrarInfo() {
		System.out.println("Conta: " + this.numero);
		System.out.println("Saldo: R$ " + this.saldo);
		System.out.println("Especial: " + (this.especial ? "Sim" : "Não"));
		System.out.println("Limite: R$ " + this.limite);
		System.out.println("Usando cheque especial: " + (usandoChequeEspecial() ? "Sim" : "Não"));
	}

	
	public void exibirInfo() {
		mostrarInfo();
	}
}
