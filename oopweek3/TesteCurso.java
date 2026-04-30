import java.util.Scanner;

public class TesteCurso {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        
        Professor prof = new Professor("Pedro Renan", "Ciência da Computação", "pedro@exemplo.com");
        Curso curso = new Curso("Desenvolver Sistemas de Informação Java", "Noturno", prof, 5);

        System.out.println("=== Sistema de Gestão do Jovem Programador ===");
        System.out.println("Curso: " + curso.getNome());
        System.out.println("Professora: " + curso.getProfessor().getNome());

      
        for (int i = 0; i < 5; i++) {
            System.out.println("\n--- Aluno " + (i + 1) + " de 5 ---");
            System.out.print("Nome do Aluno: ");
            String nome = entrada.nextLine();
            
            System.out.print("Matrícula: ");
            String matricula = entrada.nextLine();

            
            Aluno aluno = new Aluno(nome, matricula);
            
            
            double[] notas = new double[4];

            for (int j = 0; j < 4; j++) {
                System.out.print("Nota " + (j + 1) + ": ");
                notas[j] = entrada.nextDouble();
            }
            
           
            entrada.nextLine(); 

            
            aluno.setNotas(notas);
            curso.adicionarAluno(i, aluno);
        }

        
        System.out.println("\n=== BOLETIM FINAL DA TURMA ===");
        Aluno[] listaAlunos = curso.getAlunos();
        
        for (int i = 0; i < listaAlunos.length; i++) {
            Aluno alunoAtual = listaAlunos[i];
            
            if (alunoAtual != null) { 
                double media = alunoAtual.calcularMedia();
                String status = alunoAtual.isAprovado() ? "Aprovado" : "Reprovado";
                
                System.out.printf("Aluno: %-15s | Média: %.2f | Status: %s\n", 
                                  alunoAtual.getNome(), media, status);
            }
        }

        
        System.out.printf("\n-> Média geral da turma: %.2f\n", curso.calcularMediaTurma());

        entrada.close();
    }
}