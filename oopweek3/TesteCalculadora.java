package oopweek3;
public class TesteCalculadora {
    public static void main(String[] args) {
        calculadora calculadora = new calculadora();
        System.out.println("Soma (10 + 5): " + calculadora.somar(10, 5));
        System.out.println("Subtração (10 - 5): " + calculadora.subtrair(10, 5));
        System.out.println("Multiplicação (10 * 5): " + calculadora.multiplicar(10, 5));
        System.out.println("Divisão (10 / 5): " + calculadora.dividir(10, 5));
        System.out.println("Potência (2 elevado a 3): " + calculadora.elevarPotencia(2, 3));
    }
}