package DependencyInjection.WithoutDI;

public class Chef {
    private Food food;

    public Chef(){
        /*Kelas chef dependan ke kelas burger, jika chef ingin memasak makanan lain, maka harus membuat kelas chef lagi atau mengganti 1 persatu.*/
        food = new Burger();
    }

    public void getFood() {
        System.out.println("Mengambil bahan");
        System.out.println(food.makeFood());
    }
}
