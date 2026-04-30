package oopweek3;
import java.util.Scanner;

public class TesteAgenda {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o nome da Agenda: ");
        String nomeAgenda = scan.nextLine();
        
        Agenda agenda = new Agenda(nomeAgenda, 3);

        for (int i = 0; i < 3; i++) {
            System.out.println("\n--- Contato " + (i + 1) + " ---");
            System.out.print("Nome: ");
            String nome = scan.nextLine();
            System.out.print("Telefone: ");
            String telefone = scan.nextLine();
            System.out.print("Email: ");
            String email = scan.nextLine();

            Contato c = new Contato(nome, telefone, email);
            agenda.adicionarContato(i, c);
        }

        System.out.println("\n" + agenda.obterInfoAgenda());
        scan.close();
    }
}



 public class Contato {


    private String nome;
    private String telefone;
    private String email;

    public Contato(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public String obterInfo() {
        return "Nome: " + nome + " | Telefone: " + telefone + " | Email: " + email;
    }
}