package listaextra;
import java.util.Scanner;

public class CalculadoraAcougue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

     
        System.out.println("--- Tipos de Carne ---");
        System.out.println("1 - File duplo");
        System.out.println("2 - Alcatra");
        System.out.println("3 - Picanha");
        System.out.print("Escolha o tipo de carne (1, 2 ou 3): ");
        int tipoCarne = sc.nextInt();

     
        System.out.print("Digite a quantidade em kg: ");
        double quantidade = sc.nextDouble();

        String nomeCarne = "";
        double precoKg = 0.0;

        
        if (tipoCarne == 1) {
            nomeCarne = "File duplo";
            precoKg = (quantidade <= 5.0) ? 4.90 : 5.80;
        } else if (tipoCarne == 2) {
            nomeCarne = "Alcatra";
            precoKg = (quantidade <= 5.0) ? 5.90 : 6.80;
        } else if (tipoCarne == 3) {
            nomeCarne = "Picanha";
            precoKg = (quantidade <= 5.0) ? 6.90 : 7.80;
        } else {
            System.out.println("Opção de carne inválida. Encerrando o programa.");
            sc.close();
            return;
        }

        
        double totalBruto = precoKg * quantidade;

        System.out.println("\n--- RESUMO DA COMPRA ---");
        
        
        System.out.printf("Produto: %.2f kg de %s\n", quantidade, nomeCarne);
        
        
        System.out.printf("Cálculo: %.2f kg x R$ %.2f = R$ %.2f\n", quantidade, precoKg, totalBruto);

        
        System.out.println("\n--- PAGAMENTO ---");
        System.out.print("Pagamento no cartão? (Digite 1 para SIM, qualquer outro número para NÃO): ");
        int formaPagamento = sc.nextInt();

        double desconto = 0.0;
        
       
        if (formaPagamento == 1) {
            desconto = totalBruto * 0.05;
        }

        double totalPagar = totalBruto - desconto;

       
        if (desconto > 0) {
            System.out.printf("Desconto aplicado (5%%): R$ %.2f\n", desconto);
        } else {
            System.out.println("Desconto aplicado: R$ 0,00");
        }
        
        System.out.printf("Total a pagar: R$ %.2f\n", totalPagar);

        sc.close();
    }
}