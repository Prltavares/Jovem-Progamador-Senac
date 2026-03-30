package ifelse;

public class Ex2{
    public static void main(String[] args) {
        char nota = 'D';

        switch (nota) {
            case 'A':
                System.out.println("Aluno aprovado. excelente!");
                break;
            case 'B':
                System.out.println("Aluno aprovado. muito bom!");
                break;
            case 'C': 
                System.out.println("Aluno aprovado. mais cuidado na próxima!");
                break;
            default:
                System.out.println("Aluno reprovado. Estude mais para melhorar sua nota!");
                break;
        }

    }
}