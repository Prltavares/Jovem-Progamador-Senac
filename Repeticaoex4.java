import java.util.Scanner;

public class Repeticaoex4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int codigo, senha;
		while (true) {
			System.out.print("Digite o código do usuário (positivo): ");
			codigo = sc.nextInt();
			System.out.print("Digite a senha do usuário (positivo): ");
			senha = sc.nextInt();
			if (codigo == senha) {
				System.out.println("Erro: a senha não pode ser igual ao código. Tente novamente.\n");
			} else {
				break;
			}
		}
		System.out.println("Cadastro realizado com sucesso!");
		sc.close();
	}
}
