public class Dog {
    private final int MAX_RUN_DISTANCE = 800;
    private final int MAX_SWIM_DISTANCE = 50;
    private String name;
    private int count = 0;

    public Dog(String name) {
        this.name = name;
        count++;
    }


    public void running(int distance) {
        if(distance <= MAX_RUN_DISTANCE) {
            System.out.println("Собака " + name + " пробежала " + distance + " метров");
        } else System.out.println("Собака " + name + " не может пробежать " + distance + " метров");
    }


    public void swimming(int distance) {
        if(distance <= MAX_SWIM_DISTANCE) {
            System.out.println("Собака " + name + " проплыла " + distance + " метров");
        } else System.out.println("Собака " + name + " не может проплыть " + distance + " метров");
    }
}
