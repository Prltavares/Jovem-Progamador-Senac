package mes1.week3.week3;


import java.util.Scanner;

public class Lista4_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner( System.in);
		int valorA;
		int valorB;
		int valorC;
		
		System.out.println(" Digite o primeiro valor:");
		valorA = sc.nextInt();
        
		System.out.println("Digite o segundo valor:");
		valorB = sc.nextInt();
		
		valorC = valorA - valorB;
		
		
		System.out.println("a diferença é de:" + valorC);
		
		
		
	}

}
