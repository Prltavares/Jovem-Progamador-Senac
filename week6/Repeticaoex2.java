package week6;
public class Repeticaoex2 {
	public static void main(String[] args) {
		int count = 0;
		int num = 1001;
		while (true) {
			if (num % 11 == 5) {
				count++;
				if (count == 5) {
					System.out.println("O quinto número maior que 1000 cuja divisão por 11 tem resto 5 é: " + num);
					break;
				}
			}
			num++;
		}
	}
}
