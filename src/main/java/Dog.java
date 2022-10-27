public class Dog implements Animals {
    private final int MAX_RUN_DISTANCE = 800;
    private final int MAX_SWIM_DISTANCE = 50;
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void running(int distance) {
        if(distance <= MAX_RUN_DISTANCE) {
            System.out.println("Собака " + name + " пробежала " + distance + " метров");
        } else System.out.println("Собака " + name + " не может пробежать " + distance + " метров");
    }

    @Override
    public void swimming(int distance) {
        if(distance <= MAX_SWIM_DISTANCE) {
            System.out.println("Собака " + name + " проплыла " + distance + " метров");
        } else System.out.println("Собака " + name + " не может проплыть " + distance + " метров");
    }
}
