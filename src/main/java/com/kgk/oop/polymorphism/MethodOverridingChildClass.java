package main.java.com.kgk.oop.polymorphism;

/**
 * This is subclass
 */
public class MethodOverridingChildClass extends MethodOverridingParentClass{
    String dataMember = "Child class data member";
    @Override
    public void run() {
        System.out.println("Child class is running");
    }
}
