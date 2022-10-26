import java.util.concurrent.Callable;

public class MyApp {
    public static void main(String[] args) {
        Cat cat = new Cat("Alex");
        cat.running(200);

        Dog dog = new Dog("Rex");
        dog.running(350);


    }
}
