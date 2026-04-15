package oop;

public class testecarro {
    public static void main(String[] args) {
        carro van = new carro();
        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.nmrpassageiros = 10;
        van.capacidadeCombustivel = 100;
        van.consumoCombustivel = 0.2;

        System.out.println(van.marca);
        System.out.println(van.modelo);

        carro fusca = new carro();
        fusca.marca = "Volkswagen";             
        fusca.modelo = "Fusca";
        fusca.nmrpassageiros = 4;
        fusca.capacidadeCombustivel = 50;
        fusca.consumoCombustivel = 0.15;

        System.out.println(fusca.marca);
        System.out.println(fusca.modelo);

        


    }


}
