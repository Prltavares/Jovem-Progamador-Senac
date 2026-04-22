package lista2;
public class SistemaUniversidade {

    public static void main(String[] args) {
        
        // 1. Criando um Curso
        curso cursoTI = new curso();
        cursoTI.nome = "Sistemas de Informação";
        
        // 2. Criando um Professor (com todos os dados repetidos, sem herança)
        professor profAlan = new professor();
        profAlan.nome = "Alan Turing";
        profAlan.cpf = "111.222.333-44";
        profAlan.titulacao = "Doutor";
        // ... outros atributos
        
        // 3. Criando uma Disciplina e ligando ao Professor e ao Curso
        disciplina algoritmos = new disciplina();
        algoritmos.nome = "Algoritmos e Lógica";
        algoritmos.professorMinistrante = profAlan;
        algoritmos.cursoVinculado = cursoTI;
        
        // 4. Criando um Aluno e ligando ao Curso
        aluno alunoJoao = new aluno();
        alunoJoao.nome = "João da Silva";
        alunoJoao.matricula = "2023001";
        alunoJoao.cursoMatriculado = cursoTI;
        
        // Simulação de saídas
        System.out.println("Sistema Acadêmico Iniciado.");
        System.out.println("Aluno: " + alunoJoao.nome + " matriculado em " + alunoJoao.cursoMatriculado.nome);
    }
}