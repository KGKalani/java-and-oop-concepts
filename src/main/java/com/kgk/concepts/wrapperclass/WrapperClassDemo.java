package main.java.com.kgk.concepts.wrapperclass;

/**
 * Java Wrapper class provides a mechanism to convert
 *      > a primitive data into an object (autoboxing)
 *      > and an object to primitive data (unboxing)
 * Primitive data types: boolean, char, byte, short, int, long, float, double
 * Wrapper classes: Boolean, Character, Byte, Short, Integer, Long, Float, Double
 *
 * Custom Wrapper Classes : We can create our own wrapper classes which wraps primitive data types
 */
public class WrapperClassDemo {

    public static void main(String args[]){
        autoboxingDemo();
        unboxingDemo();
        customWrapperDemo();
    }

    /**
     * Java program to convert primitive into objects
     * Autoboxing example of int to Integer
     */
    public static void autoboxingDemo(){
        System.out.println("***** autoboxing *****");
        int a = 10;
        Integer aInteger = Integer.valueOf(a);//converting int into Integer explicitly
        Integer jInteger = null;
                jInteger= a;//autoboxing, now compiler will write Integer.valueOf(a) internally

        System.out.println("a = " + a + "\naInteger = " + aInteger + "\njInteger = " + jInteger);

    }

    /**
     * Java program to convert object into primitivesUnboxing example of Integer to int
    */
    public static void unboxingDemo(){
        System.out.println("\n***** unboxing *****");
        Integer aInteger = 20;
        int a = aInteger.intValue();//converting Integer to int explicitly
        int j = aInteger;//unboxing, now compiler will write a.intValue() internally

        System.out.println("aInteger = " + aInteger + "\na = " + a + "\nj = " + j);
    }

    /**
     * Custom wrapper class demo
     */
    public static void customWrapperDemo(){
        System.out.println("\n***** Custom Wrapper Class Demo *****");
        CustomIntegerWrapper i = new CustomIntegerWrapper(10);
        System.out.println("CustomIntegerWrapper value = " + i);
    }

}
