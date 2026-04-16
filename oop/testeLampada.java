package oop;

import java.util.Scanner;

public class testeLampada {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        lampada led = new lampada();

        System.out.print("Quer ligar a luz? (sim/não): ");
        String resposta = teclado.nextLine();
        if (resposta.equals("sim")) {
            led.ligar();
        }
        else {
            led.desligar();
        }

        System.out.println("A lâmpada está " + (led.ligada ?"ligada" : "desligada") );
        teclado.close();
    }
}
