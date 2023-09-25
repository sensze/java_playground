package StaticMethod;

public class CounterMachine {
    private static int counter = 0;


    public static void count(){
        counter++;
    }
    public static int getCount(){
        return counter;
    }
}
