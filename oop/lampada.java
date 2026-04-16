package oop;

public class lampada {
   
    boolean ligada;
    String cor;
    int potencia;

    void ligar() {
        ligada = true;
    }

    void desligar() {
        ligada = false;
    }

    void alterarEstado() {
        if (ligada) {
            desligar();
        } else {
            ligar();
        }
    }

    void trocarCor(String novaCor) {
        cor = novaCor;
    }

    void mostrarStatus() {
        if (ligada) {
            System.out.println("Lampada acesa");
        } else {
            System.out.println("Lampada apagada");
        }

        System.out.println("Potência:" + potencia);
        System.out.println("Cor: " + cor);

    }


}
