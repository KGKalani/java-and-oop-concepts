package kgk.main.java.oop.concepts.interfaceconcept;

/**
 * It is used to achieve the abstraction
 * This support multiple inheritance
 *
 * Interface which has no members are called as Marker/Tagged interfaces. e.g. Serializable, Cloneable
 */
public class InterfaceDemo {

    public static void demo(){
        /*
            Interface cannot be instantiated
         */
        //Drawable d = new Drawable();

        Drawable drawable = new Rectangle();
        drawable.draw();

        /*
        Multiple inheritance
         */
        Circle circle = new Circle();
        circle.draw();
        circle.print();

        /*
        Default method in interface
         */
        System.out.println("\n\t>> Default method is calling");
        drawable.color(); //default method. has overridden by Rectangle class
        circle.color(); //default method in Drawable interface is called

        /*
        Static method in interface
         */
        System.out.println("\n\t>> Static method is calling");
        System.out.println("Static method in Drawable Interface is calling : " + Drawable.cube(3)); //This is calling the method in drawable interface
        System.out.println("Static method in Circle class is calling : " + Circle.cube(4)); //This is calling the method in Circle class
    }
}
