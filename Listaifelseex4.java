


import java.util.Scanner;

public class Listaifelseex4 {
public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    Double valorgasto;
    String dinheiro, cheque, pagamento;
    Double desconto,valorTotal = null;
    
    

    System.out.println("Nessa semana se você gastar mais de Rs100,00 e fazer o pagamento em dinheiro, você ganha um desconto de 10% no valor total da compra");
    System.out.println("Digite o valor gasto");  
    valorgasto = sc.nextDouble();

    System.out.println("Digite a forma de pagamento: dinheiro ou cheque");
    pagamento = sc.next();
    
    
    
    if ((valorgasto >= 100) && (pagamento.equalsIgnoreCase("dinheiro"))) {
    	desconto = (valorgasto * 0.10);  
    	valorTotal = (valorgasto - desconto);
    	System.out.println("Parabéns você ganhou desconto de 10% o valor total da compra foi de R$ " + valorTotal);
    }
    	
    else if ((valorgasto >= 100)&& (pagamento.equalsIgnoreCase("cheque"))) {
    		System.out.println("infelizmente você não foi elegivel para o desconto, seu valor total de compra é de R$" + valorTotal );
			
    } else  if ((valorgasto < 100) && (pagamento.equalsIgnoreCase("dinheiro") && (pagamento.equalsIgnoreCase("cheque")))) {
    	
    {
    	
    	
    	
		
	} 
			
    }
    	 
    	
    
}
    


}
