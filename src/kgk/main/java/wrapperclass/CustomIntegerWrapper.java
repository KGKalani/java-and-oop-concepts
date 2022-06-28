package kgk.main.java.wrapperclass;

/**
 * Custom wrapper class
 */
public class CustomIntegerWrapper {
    private int i;
    CustomIntegerWrapper(){}

    CustomIntegerWrapper(int i){
        this.i = i;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    @Override
    public String toString() {
        return Integer.toString(i);
    }
}
