package main.java.com.kgk.concepts.instanceinitializerblockconcept;

/**
 * > Instance Initializer Block is used to initialize the instance data member
 * > It runs each time when object of the class is created
 * > This is used because sometimes we want to perform some operations while assigning value to instance data member
 * > Places in java where we can perform initialization operations:
 *      method
 *      constructor
 *      block
 *
 *  Although this shows that the instance initializer block is firstly invoked, what actually does is
 *  the java compiler copies the instance initializer block in the constructor
 *  after the first statement super().
 *      1. Parent class constructor is invoked
 *      2. Child class instance initializer block is invoked (This is copied into the child class constructor by the compiler)
 *      3. Other statements in child class constructor are invoked.
 */
public class InstanceInitializerBlock extends InstanceInitializerBlockParent{
    public InstanceInitializerBlock(){
        System.out.println("InstanceInitializerBlock Constructor is invoked");
    }

    {
        System.out.println("Instance Initializer Block is invoked");
    }
}

