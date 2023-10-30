package main.java.com.kgk.oop;

import main.java.com.kgk.oop.abstraction.AbstractionDemo;
import main.java.com.kgk.oop.inheritance.InheritanceDemo;
import main.java.com.kgk.oop.interfaceconcept.InterfaceDemo;
import main.java.com.kgk.oop.polymorphism.PolymorphismDemo;

public class OOPConceptsDemo {
    public static void main(String args[]) {
        System.out.println("======Inheritance Concept Demo======");
        InheritanceDemo.demo();

        System.out.println("\n\n======Polymorphism Concept Demo======");
        PolymorphismDemo.demo();

        System.out.println("\n\n======Abstraction Concept Demo======");
        AbstractionDemo.demo();

        System.out.println("\n\n======Interface Concept Demo======");
        InterfaceDemo.demo();
    }
}

