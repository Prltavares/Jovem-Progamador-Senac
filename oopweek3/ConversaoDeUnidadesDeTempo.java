package oopweek3;
// Arquivo: ConversaoDeUnidadesDeTempo.java
public class ConversaoDeUnidadesDeTempo {
    
    public static int minutoParaSegundos(int minutos) {
        return minutos * 60;
    }
    
    public static int horaParaMinutos(int horas) {
        return horas * 60;
    }
    
    public static int diaParaHoras(int dias) {
        return dias * 24;
    }
    
    public static int semanaParaDias(int semanas) {
        return semanas * 7;
    }
    
    public static int mesParaDias(int meses) {
        return meses * 30; // Conversão aproximada solicitada
    }
    
    public static double anoParaDias(int anos) {
        return anos * 365.25;
    }

    public static void main(String[] args) {
        System.out.println("2 minutos em segundos: " + ConversaoDeUnidadesDeTempo.minutoParaSegundos(2));
        System.out.println("5 horas em minutos: " + ConversaoDeUnidadesDeTempo.horaParaMinutos(5));
        System.out.println("3 dias em horas: " + ConversaoDeUnidadesDeTempo.diaParaHoras(3));
        System.out.println("2 semanas em dias: " + ConversaoDeUnidadesDeTempo.semanaParaDias(2));
        System.out.println("6 meses em dias: " + ConversaoDeUnidadesDeTempo.mesParaDias(6));
        System.out.println("4 anos em dias: " + ConversaoDeUnidadesDeTempo.anoParaDias(4));
    }
}