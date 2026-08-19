class Engine {
    void start() {
        System.out.println("Engine Started");
    }
}
class Car {
    Engine engine = new Engine();
    void drive() {
        engine.start();
        System.out.println("Driving");
    }
}
class SportsCar extends Car {
    void race() {
        System.out.println("Racing");
    }
}
public class Main {
    public static void main(String[] args) {
        SportsCar car = new SportsCar();
        car.drive();
        car.race();
    }
}