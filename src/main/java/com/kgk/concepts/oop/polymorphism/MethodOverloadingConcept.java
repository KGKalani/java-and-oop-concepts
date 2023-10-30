package main.java.com.kgk.concepts.oop.polymorphism;

/**
 * If a class has multiple methods with same name but different parameters,
 * this is called Method Overloading (Compile time polymorphism)
 * Ways to overload methods
 *  1. By changing number of arguments
 *  2. By changing the data types
 */
public class MethodOverloadingConcept {
    static int sum(int num1, int num2){return num1 + num2;}
    static int sum(int num1, int num2, int num3){return num1 + num2 + num3;} //by changing num of arguments
    static double sum(double num1, double num2){return num1 + num2;} // by changing data types

}
