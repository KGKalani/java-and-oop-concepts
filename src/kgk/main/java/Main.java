package kgk.main.java;

import kgk.main.java.statickeyconcept.StaticConceptDemo;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        StaticConceptDemo staticConceptDemo =  new StaticConceptDemo(1, "Jhon", "Computer Science");
        staticConceptDemo.displayDetails();

      }
}