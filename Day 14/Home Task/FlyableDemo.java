interface Flyable {
    void fly();
}
class Bird implements Flyable {
    public void fly() {
        System.out.println("Bird is flapping wings");
    }
}
class Airplane implements Flyable {
    public void fly() {
        System.out.println("Airplane is engaging engines");
    }
}
public class FlyableDemo {
    public static void main(String[] args) {
        Flyable[] objects = {new Bird(), new Airplane()};

        for (Flyable obj : objects) {
            obj.fly();
        }
    }
}