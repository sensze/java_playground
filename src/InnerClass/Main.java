package InnerClass;

public class Main {
    public static void main(String[] args) {
        Outer out = new Outer();
        out.outerMethod();

        System.out.println(out.getX());
    }
}
