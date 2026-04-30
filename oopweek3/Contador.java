package oopweek3;


class Contador {
    
    private static int contagem = 0;

    
    public Contador() {
        incrementar();
    }

    public static void zerar() {
        contagem = 0;
    }

    public static void incrementar() {
        contagem++;
    }

    public static int retornarValor() {
        return contagem;
    }
}