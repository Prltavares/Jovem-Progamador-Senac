package lista2;
import java.util.Scanner;

public class alunoTeste {
    public static void main(String[] args) {
        String nome; 
    int matricula;
    String curso;
    String disciplina1;
    String disciplina2;
    String disciplina3;
    double notas1, notas2, notas3;
      
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do aluno:");
          nome = sc.nextLine();

        System.out.println("Digite a matrícula do aluno:");
         matricula = sc.nextInt();

        sc.nextLine(); 
        System.out.println("Digite o curso do aluno:");
         curso = sc.nextLine();

        System.out.println("Digite a disciplina 1:");
         disciplina1 = sc.nextLine();
         System.out.println("Digite a nota da disciplina 1:");
         notas1 = sc.nextDouble();
            sc.nextLine();

        System.out.println("Digite a disciplina 2:");
         disciplina2 = sc.nextLine();
            System.out.println("Digite a nota da disciplina 2:");  
            notas2 = sc.nextDouble();
             sc.nextLine();

        System.out.println("Digite a disciplina 3:");
         disciplina3 = sc.nextLine();
            System.out.println("Digite a nota da disciplina 3:");
            notas3 = sc.nextDouble();

         if(notas1 >=7) {
            System.out.println("Na Materia de " + disciplina1 + " Você foi aprovado a!");}
         else {
            System.out.println("Você foi reprovado na materia " + disciplina1 + " !");
         }

         if(notas2 >=7){
            System.out.println("Na Materia de " + disciplina2 + " Você foi aprovado n!");}
         else {
            System.out.println("Você foi reprovado na materia " + disciplina2 + " !");
         }
            if(notas3 >=7){
                System.out.println("Na Materia de " + disciplina3 + " Você foi aprovado !");}
            else {
                System.out.println("Você foi reprovado na materia " + disciplina3 + " !");
            }

        
    }
    
}

