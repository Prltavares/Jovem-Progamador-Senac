package mes1.week3.week3;
import java.util.Scanner;

public class firstClass {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		String nome;
		
		System.out.println("Hello world");
		
		System.out.println("Digite seu nome: ");
		nome = sc.nextLine();

		//teclas de atalho no eclipse:
		//syso + ctrl + space = System.out.println();	
		//ctrl + shift + f = formatar o código
		//ctrl + shift + o = organizar os imports
		//ctrl + shift + / = comentar um bloco de código
		//ctrl + shift + \ = descomentar um bloco de código
		//ctrl + d = deletar a linha atual
		//ctrl + alt + down = copiar a linha atual para baixo
		//ctrl + alt + up = copiar a linha atual para cima
		//'ctrl + shift + f10 = executar o programa		
		
		System.out.println("Bem-Vindo, " + nome);
		System.out.println("tenha um bom dia!");
		
		sc.close();

	}

}
