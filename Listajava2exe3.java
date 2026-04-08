

public class Listajava2exe3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o total de minutos usados: ");
		int minutos = scanner.nextInt();
		double valorPorHora = 2.30;
		double horas = minutos / 60.0;
		double valor = horas * valorPorHora;
		System.out.printf("Valor a ser pago: R$ %.2f\n", valor);
		scanner.close();
	}
}
