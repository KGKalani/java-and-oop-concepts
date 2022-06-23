package kgk.main.java.oop.concepts;

import kgk.main.java.oop.concepts.abstraction.AbstractionDemo;
import kgk.main.java.oop.concepts.inheritance.InheritanceDemo;
import kgk.main.java.oop.concepts.interfaceconcept.InterfaceDemo;
import kgk.main.java.oop.concepts.polymorphism.PolymorphismDemo;

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

