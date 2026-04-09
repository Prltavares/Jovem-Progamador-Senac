package week5.ifelse;

public class Ex1 {
public static void main(String[] args) {
    int salario = 1000;
    double bonus = 0;
    if (salario > 1000) {
        bonus = salario * 0.10;
    } else {
        bonus = salario * 0.15;
    }
    System.out.println("Bonus: " + bonus);
}
}
