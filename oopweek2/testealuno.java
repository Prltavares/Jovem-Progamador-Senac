package oopweek2;

import java.util.Scanner;

public class testealuno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        aluno aluno = new aluno();

        System.out.print("Digite o nome do aluno: ");
        aluno.setNome(sc.nextLine());

        System.out.print("Digite a matrícula: ");
        aluno.setMatricula(sc.nextLine());

        System.out.print("Digite o curso: ");
        aluno.setCurso(sc.nextLine());

        for (int i = 0; i < 3; i++) {
            System.out.print("Digite o nome da disciplina " + (i + 1) + ": ");
            String disciplina = sc.nextLine();
            aluno.setDisciplina(i, disciplina);

            System.out.print("Digite a nota da disciplina " + disciplina + ": ");
            double nota = sc.nextDouble();
            sc.nextLine(); 
            aluno.setNota(i, nota);
        }

        System.out.println("Informações do aluno:");
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Matrícula: " + aluno.getMatricula());
        System.out.println("Curso: " + aluno.getCurso());

        System.out.println("Disciplinas e notas:");
        for (int i = 0; i < 3; i++) {
            String disciplina = aluno.getDisciplinas()[i];
            double nota = aluno.getNotas()[i];
            boolean aprovado = aluno.estaAprovado(disciplina);
            System.out.println("Disciplina: " + disciplina + ", Nota: " + nota + ", Aprovado: " + (aprovado ? "Sim" : "Não"));
        }

        sc.close();
    }
}