package kgk.main.java.oop.concepts.interfaceconcept;

/**
 * It is used to achieve the abstraction
 * This support multiple inheritance
 * > Java compiler adds
 *      -- public and abstract keywords before the interface methods
 *      -- public, static and final keywords before the data members
 * > Since java 8,
 *      -- Interface can have methods with method body. But those methods should be default
 *      -- Interface can have static methods too
 *
 * Interface which has no members are called as Marker/Tagged interfaces. e.g. Serializable, Cloneable
 */
public class InterfaceDemo {

    public static void demo(){
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
