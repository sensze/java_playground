package DependencyInjection.WithDI;

public class Chef {
    private Food food;

    /*Dengan menginjeksikan kelas implementasi makanan ke constructor, chef dapat memasak banyak makanan secara dinamis*/
    public Chef(Food food){
        this.food = food;
    }

    public void getFood() {
        System.out.println("Mengambil bahan");
        System.out.println(food.makeFood());
    }
}
