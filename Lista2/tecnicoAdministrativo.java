package Lista2;
public class tecnicoAdministrativo {
String nome;
    String endereco;
    String telefone;
    String cpf;
    String numeroCTPS;
    double salario;
    String cargo;
    String departamento;

    public void exibirDadosTecnico() {
        System.out.println("Técnico: " + nome + " | Cargo: " + cargo + " | Depto: " + departamento);
    }
}

