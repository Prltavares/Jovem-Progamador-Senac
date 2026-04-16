import java.util.ArrayList;
import java.util.List;

public class aluno{
    String nome;
    String matricula;
    String cpf;
    curso cursoMatriculado;

    List<disciplina> disciplinasCursadas = new ArrayList<>();

    public void matricularNaDisciplina(disciplina disciplina) {
        disciplinasCursadas.add(disciplina);
        System.out.println(nome + " foi matriculado(a) na disciplina de " + disciplina.nome);
    }

    public void exibirDadosAluno() {
        System.out.println("Aluno: " + nome + " | Matrícula: " + matricula);
        System.out.println("Curso: " + cursoMatriculado.nome);
        System.out.println("Disciplinas Cursadas: " + disciplinasCursadas.size());
    }

}