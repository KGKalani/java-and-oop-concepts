package main.java.com.kgk.oop.polymorphism;

/**
 * > If subclass (child class) has the same method as declared in the parent class,
 *   it is known as method overriding (runtime polymorphism)
 * > Method overriding is used to provide the specific implementation of a method
 *   which is already provided by its superclass.
 * > Here method must have the same name and same parameter as in the parent class
 */
public class MethodOverridingParentClass {
    String dataMember = "Parent class data member";
    public void run(){
        System.out.println("Parent class is running");
    }
}
