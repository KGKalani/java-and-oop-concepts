package kgk.main.java.oop.concepts.interfaceconcept;

public class Rectangle implements Drawable,Printable{
    @Override
    public void draw() {
        System.out.println("Draw a Rectangle - " + DEFAULT_COUNT);
    }

    @Override
    public void print() {
        System.out.println("Print a Rectangle");
    }

    public void color(){
        System.out.println("Color a Rectangle");
    }

    public static int cube(int x){return x*x*x;}
}
