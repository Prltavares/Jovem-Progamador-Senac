package oopweek2;
public class lampadateste {
    public static void main(String[] args) {
        
        lampada l1 = new lampada();
        l1.setCor("Branca");
        l1.setMarca("Philips");
        System.out.println("Cor: " + l1.getCor());
        System.out.println("Marca: " + l1.getMarca());
        System.out.println("Ligada? " + (l1.isLigada() ? "Sim" : "Não"));
        l1.ligar();
        l1.desligar();

    }

    
}
       
