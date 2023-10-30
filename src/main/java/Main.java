package main.java;

import main.java.com.kgk.concepts.statickeyconcept.StaticConceptDemo;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        StaticConceptDemo staticConceptDemo =  new StaticConceptDemo(1, "Jhon", "Computer Science");
        staticConceptDemo.displayDetails();

      }
}