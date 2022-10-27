public class Cat implements Animals {
    private final int MAX_RUN_DISTANCE = 150;
    private final int MAX_SWIM_DISTANCE = 0;
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void running(int distance) {
        if(distance <= MAX_RUN_DISTANCE) {
            System.out.println("Кот " + name + " пробежал " + distance + " метров");
        } else System.out.println("Кот " + name + " не может пробежать " + distance + " метров");
    }

    @Override
    public void swimming(int distance) {
        System.out.println("Кот " + name + " не умеет плавать");
    }
}
