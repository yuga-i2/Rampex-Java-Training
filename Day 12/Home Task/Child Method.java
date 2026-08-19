class Engine {
    Engine() {
        System.out.println("Engine Ready");
    }
}
class MusicSystem {
    MusicSystem() {
        System.out.println("Music System Ready");
    }
}
class Car {
    Engine engine = new Engine();
    MusicSystem music = new MusicSystem();

    Car() {
        System.out.println("Car Ready");
    }
}
public class Main {
    public static void main(String[] args) {
        Car car = new Car();
    }
}