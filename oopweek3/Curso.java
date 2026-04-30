public class Curso {
   
    private String nome;
    private String horario;
    
   
    private Professor professor;
    


   
    public Curso(String nome, String horario, Professor professor, int quantidadeAlunos) {
        this.nome = nome;
        this.horario = horario;
        this.professor = professor;
        this.alunos = new Aluno[quantidadeAlunos]; 


    public void adicionarAluno(int index, Aluno aluno) {
        if (index >= 0 && index < alunos.length) {
            this.alunos[index] = aluno;
        }
    }

    public double calcularMediaTurma() {
        double somaMedias = 0;
        int alunosValidos = 0;

        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i] != null) { 
                somaMedias += alunos[i].calcularMedia();
                alunosValidos++;
            }
        }
        
        if (alunosValidos == 0) {
            return 0; 
        }
        
        return somaMedias / alunosValidos;
    }

    
    
    public String getNome() {
        return nome;
    }

    public Professor getProfessor() {
        return professor;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }
}
