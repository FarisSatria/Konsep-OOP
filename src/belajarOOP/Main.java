package belajarOOP;

public class Main {
    public static void main(String[] args) {
        Encapsulation e = new Encapsulation();
        e.setSepeda("Sepeda Gunung");
        System.out.println("Jenis Sepeda: " + e.getSepeda());

        Inheritance i = new Inheritance();
        Inheritance.Sepeda s = i.new Sepeda();
        System.out.println("Bunyi bell sepeda: " + s.bunyiBell());

        Abstraction a = new Abstraction();
        Abstraction.Bergerak b = a.new Bergerak();
        b.bergerak();

        Polymorphism p = new Polymorphism();
        Polymorphism.Sepeda sepeda1 = p.new Polygon();
        Polymorphism.Sepeda sepeda2 = p.new Pacific();

        System.out.println("Merek Merek sepeda:");
        sepeda1.merek();
        sepeda2.merek();
    }
}
