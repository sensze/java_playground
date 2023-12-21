package DependencyInjection.WithDI;

public class Main {
    public static void main(String[] args) {
        /*Dengan menginjeksikan kelas implementasi makanan ke constructor, chef dapat memasak banyak makanan secara dinamis*/
        Chef jason = new Chef(new Burger());

        jason.getFood();
    }
}
