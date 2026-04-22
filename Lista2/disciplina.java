package lista2;

public class disciplina {
int codigo;
    String nome;
    int cargaHoraria;
    professor professorMinistrante; // Ligação com a classe Professor
    curso cursoVinculado;           // Ligação com a classe Curso

    public void exibirDadosDisciplina() {
        System.out.println("Disciplina: " + nome + " | Carga Horária: " + cargaHoraria + "h");
        System.out.println("Ministrada por: " + professorMinistrante.nome);
    }
}

