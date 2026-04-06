package week5;

public class Listajava2exe2 {

	import java.util.Scanner;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite sua idade: ");
		int idade = scanner.nextInt();
		System.out.println("Sua idade é: " + idade + " anos.");
		scanner.close();
	}
}
