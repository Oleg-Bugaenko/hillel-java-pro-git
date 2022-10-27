import java.util.concurrent.Callable;

public class MyApp {
    public static void main(String[] args) {

        Animals[] pets = {new Cat("Alex"),
                new Dog("Butch")};

        for (Animals pet: pets) {
            pet.running(120);
            pet.swimming(150);
            System.out.println("------------------");
        }
    }
}
