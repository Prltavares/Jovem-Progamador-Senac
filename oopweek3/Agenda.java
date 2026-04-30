package oopweek3;
class Agenda {
    private String nome;
    private Contato[] contatos;

    public Agenda(String nome, int quantidadeContatos) {
        this.nome = nome;
        this.contatos = new Contato[quantidadeContatos];
    }

    public void adicionarContato(int index, Contato contato) {
        if (index >= 0 && index < contatos.length) {
            this.contatos[index] = contato;
        }
    }

    public String obterInfoAgenda() {
        String info = "--- Agenda: " + this.nome + " ---\n";
        if (contatos != null) {
            for (Contato c : contatos) {
                if (c != null) {
                    info += c.obterInfo() + "\n";
                }
            }
        }
        return info;
    }
}

