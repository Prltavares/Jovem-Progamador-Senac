package ifelse;

public class ExCondicional1 {

	public static void main(String[] args) {
		int estoque = 50; 
		if (estoque >= 100) {
			System.out.println("Produto com quantidade suficiente.");
			} else if (estoque < 100 && estoque > 50) {
			System.out.println("Alerta: Avaliar possibilidade de novo pedido.");
			} else {
			System.out.println("ATENCAO! Faca um novo pedido.");
	}

	}
}
