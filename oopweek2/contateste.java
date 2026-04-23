package oopweek2;

public class contateste {
	public static void main(String[] args) {
		
		contacorrente c1 = new contacorrente();
		c1.setNumero(123);
		c1.setEspecial(true);
		c1.setLimite(500.0);
		c1.depositar(200.0);
		System.out.println("Conta 1:");
		c1.exibirInfo();
		System.out.println("sacando 300 reais");
		boolean saque1 = c1.sacar(300.0);
		System.out.println("saque feiro " + (saque1 ? "Sim" : "Não"));
		c1.exibirInfo();

		System.out.println();

		
		contacorrente c2 = new contacorrente(456, 100.0, false, 200.0);
		System.out.println("conta 2:");
		c2.exibirInfo();
		System.out.println("colocando 50 reais");
		c2.depositar(50.0);
		c2.exibirInfo();
		System.out.println("Sacando 180 reais");
		boolean saque2 = c2.sacar(180.0);
		System.out.println("Saque feito " + (saque2 ? "Sim" : "Não"));
		c2.exibirInfo();

		System.out.println();

		// Teste do construtor sobrecarregado (sem saldo inicial)
		contacorrente c3 = new contacorrente(789, true, 1000.0);
		System.out.println("conta 3:");
		c3.exibirInfo();
		System.out.println("Tentando sacar 200...");
		boolean saque3 = c3.sacar(200.0);
		System.out.println("Saque feito: " + (saque3 ? "Sim" : "Não"));
		c3.exibirInfo();
	}
}
