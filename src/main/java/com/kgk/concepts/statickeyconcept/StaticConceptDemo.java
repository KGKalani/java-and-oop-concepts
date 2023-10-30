package main.java.com.kgk.concepts.statickeyconcept;

/**
 * static keyword can be applied with
 *  > variables (Class variable)
 *  > methods (Class method)
 *  > blocks
 *  > nested classes
 */
public class StaticConceptDemo {
    int studentID;
    String studentName;
    String studentDepartment;

    /*static variable (Class variable*/
    static String uniName;

    /*
      static block
        > This is used to initialize the static data member.
        > This is executed at the time of classloading. (before all methods in the class is called)
     */
    static {
        System.out.println(" Static Block");
        uniName = "UOM";
    }

    public StaticConceptDemo(int id, String name, String dept){
        studentID = id;
        studentName = name;
        studentDepartment = dept;
    }
    public void displayDetails(){
        System.out.println("id : "+ studentID);
        System.out.println("name : "+ studentName);
        System.out.println("dept : "+ studentDepartment);
        System.out.println("university : "+ uniName);
    }

    /*
     * static method
     * non-static variables cannot be accessed in static methods
     */
    /* public static void displayDetails(){
        System.out.println("id : "+ studentID);
        System.out.println("name : "+ studentName);
        System.out.println("dept : "+ studentDepartment);
        System.out.println("university : "+ uniName);
    }*/
}




