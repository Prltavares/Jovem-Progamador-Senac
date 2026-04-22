package oopweek2;

public class aluno {
    private String nome;
    private String matricula;
    private String curso;
    private String[] disciplinas;
    private double[] notas;

    // Construtor padrão
    public aluno() {
        this.disciplinas = new String[3];
        this.notas = new double[3];
    }

    // Construtor sobrecarregado
    public aluno(String nome, String matricula, String curso) {
        this(); // Chama o construtor padrão
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }

    // Getters e Setters com 'this'
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return this.curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String[] getDisciplinas() {
        return this.disciplinas;
    }

    public void setDisciplina(int index, String disciplina) {
        if (index >= 0 && index < 3) {
            this.disciplinas[index] = disciplina;
        }
    }

    public double[] getNotas() {
        return this.notas;
    }

    public void setNota(int index, double nota) {
        if (index >= 0 && index < 3) {
            this.notas[index] = nota;
        }
    }

    // Método auxiliar privado para encontrar o índice da disciplina
    private int findDisciplinaIndex(String disciplina) {
        for (int i = 0; i < 3; i++) {
            if (this.disciplinas[i] != null && this.disciplinas[i].equals(disciplina)) {
                return i;
            }
        }
        return -1; // Disciplina não encontrada
    }

    // Método público para verificar se aprovado em uma disciplina
    public boolean estaAprovado(String disciplina) {
        int index = this.findDisciplinaIndex(disciplina);
        if (index != -1) {
            return this.notas[index] >= 7.0;
        }
        return false; // Disciplina não encontrada
    }
}