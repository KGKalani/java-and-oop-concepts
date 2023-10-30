package main.java.com.kgk.concepts.finalkeyconcept;

/**
 * Java final keyword is used to restrict the usage of
 *      1. variables - Stop value change.
 *                      If the final variable does not have a value (blank final variable/uninitialized final variable)
 *      2. methods - Stop method override
 *                  Method is inherited but cannot be overrided
 *      3. class - Stop class inheritance
 *
 * A static final variable can be initialized only in static block.
 * Constructors cannot be final, because it is never inherited.
 */
public class FinalKeyConcept extends FinalKeyConceptParent{

    final String organization = "KGK"; //This value cannot be changed after initializing
    static final int data;//static blank final variable

    public FinalKeyConcept(){
        //organization = "GKK"; cannot change the value of final variables
        //data =123; cannot be initialized in constructor. need to be initialized in static block
    }
    //void run(){System.out.println("cannot override final methods");}

    static{ data=50;}
}
