package oopweek3;
// Arquivo: TesteContador.java

public class TesteContador {
    public static void main(String[] args) {
        System.out.println("Valor inicial: " + Contador.retornarValor());
        
        Contador c1 = new Contador();
        Contador c2 = new Contador();
        Contador c3 = new Contador();
        
        System.out.println("Valor após instanciar 3 objetos: " + Contador.retornarValor());
        
        Contador.zerar();
        System.out.println("Valor após zerar: " + Contador.retornarValor());
        
        Contador.incrementar();
        Contador.incrementar();
        System.out.println("Valor após incrementar 2 vezes: " + Contador.retornarValor());
    }
}