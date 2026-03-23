
import java.util.Scanner;

public class firstClass {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		String nome;
		
		System.out.println("Hello world");
		
		System.out.println("Digite seu nome: ");
		nome = sc.nextLine();
		
		System.out.println("Bem-Vindo, " + nome);
		
		sc.close();

	}

}
