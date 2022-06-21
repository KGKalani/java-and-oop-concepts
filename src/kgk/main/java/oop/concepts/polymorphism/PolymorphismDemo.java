package kgk.main.java.oop.concepts.polymorphism;

/**
 * Polymorphism is a concept which we can perform a single action in different ways
 * Polymorphism is a mechanism that provides a way to access different types of objects through
 * the same interface.
 * Each type can provide its own independent implementation of this interface.
 * Types of polymorphism
 *   > Static/Compile time polymorphism (Method Overloading)
 *   > Dynamic/Runtime polymorphism (Method Overriding)
 */
public class PolymorphismDemo {
    public static void demo(){
        System.out.println("Method Overloading Demo.........");
        int result1 = MethodOverloadingConcept.sum(1,2);
        System.out.println("result1 = "+result1);

        int result2 = MethodOverloadingConcept.sum(3, 4,5);
        System.out.println("result2 = "+result2);

        double result3 = MethodOverloadingConcept.sum(3.5, 4.8);
        System.out.println("result3 = "+result3);


        /*
            Child class object is referred by the reference variable of parent class
            Because of that subclass method is invoked at the runtime not compile time
         */
        System.out.println("\nMethod Overriding demo.........");
        MethodOverridingParentClass parentClass = new MethodOverridingChildClass();
        parentClass.run();

        System.out.println("\nData members cannot be overriden. Runtime polymorphism can't be achieved by data members.");
        System.out.println("dataMember Value : "+ parentClass.dataMember);

    }
}
