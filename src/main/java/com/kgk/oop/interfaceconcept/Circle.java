package main.java.com.kgk.oop.interfaceconcept;

public class Circle implements Drawable,Printable, Printable.MessagePrintable {
    @Override
    public void draw() {
        System.out.println("Draw a Circle - " + DEFAULT_COUNT);
    }

    @Override
    public void print() {
        System.out.println("Print a Circle");
    }

    public static int cube(int x){return x*x*x;}

}
