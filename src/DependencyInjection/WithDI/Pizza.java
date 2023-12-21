package DependencyInjection.WithDI;

public class Pizza implements Food {
    @Override
    public String makeFood() {
        return "Membuat Pizza";
    }
}
