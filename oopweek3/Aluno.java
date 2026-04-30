public class Aluno {

    private String nome;
    private String matricula;
    private double[] notas; 

    // Construtor
    public Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
        this.notas = new double[4]; 
    }

   
    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    
    public double calcularMedia() {
        double soma = 0;
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }
        return soma / notas.length; 
    }

    public boolean isAprovado() {
        return calcularMedia() >= 7.0;
    }

    
    
    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public double[] getNotas() {
        return notas;
    }
}