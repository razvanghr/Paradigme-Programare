package Problema4;

public class Problema4 {
    public static void main(String[] args) {
        Rectangle patrat = new Rectangle(4, 4);
        Rectangle dreptughi = new Rectangle(3 ,  2);

        System.out.println("Patrat => Arie: " + patrat.arie() + " Perimetru: " + patrat.perimetru());
        System.out.println("Dreptunghi => Arie: " + dreptughi.arie() + " Perimetru: " + dreptughi.perimetru());
    }
}
