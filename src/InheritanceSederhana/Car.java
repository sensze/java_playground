package InheritanceSederhana;

public class Car extends Vehicle {
    public void methodChild(String c) {
        System.out.println("Ini adalah method child" + c);
    }

    // Overidding
    @Override
    public void methodParent(String m) {
        System.out.println("Ini adalah method parent dari child");
    }

}
