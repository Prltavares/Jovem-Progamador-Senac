package week6;
import java.util.Scanner;

public class Repeticaoex3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um número para ver sua tabuada: ");
		int x = sc.nextInt();
		System.out.println("Tabuada de " + x + ":");
		for (int i = 1; i <= 10; i++) {
			System.out.println(x + " x " + i + " = " + (x * i));
		}
		sc.close();
	}
}
