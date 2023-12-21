package DependencyInjection.WithoutDI;

public class Burger implements Food{
    @Override
    public String makeFood() {
        return "Membuat burger";
    }
}
