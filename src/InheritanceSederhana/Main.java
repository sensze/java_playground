package InheritanceSederhana;

public class Main {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        Car c = new Car();

        v.methodParent("Parent");
        c.methodParent("Child");
        c.methodChild("Child");
        c.methodParent("Hi");
    }
}
