package oopweek2;

public class aluno {
    private String nome;
    private String matricula;
    private String curso;
    private String[] disciplinas;
    private double[] notas;

    
    public aluno() {
        this.disciplinas = new String[3];
        this.notas = new double[3];
    }

    
    public aluno(String nome, String matricula, String curso) {
        this(); 
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }

    
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

    public void setDisciplina(int i, String disciplina) {
        if (i >= 0 && i < 3) {
            this.disciplinas[i] = disciplina;
        }
    }

    public double[] getNotas() {
        return this.notas;
    }

    public void setNota(int i, double nota) {
        if (i >= 0 && i < 3) {
            this.notas[i] = nota;
        }
    }

   
    private int procurarDisciplina(String disciplina) {
        for (int i = 0; i < 3; i++) {
            if (this.disciplinas[i] != null && this.disciplinas[i].equals(disciplina)) {
                return i;
            }
        }
        return -1;
    }

   
    public boolean estaAprovado(String disciplina) {
        int i = this.procurarDisciplina(disciplina);
        if (i != -1) {
            return this.notas[i] >= 7.0;
        }
        return false; 
    }
}