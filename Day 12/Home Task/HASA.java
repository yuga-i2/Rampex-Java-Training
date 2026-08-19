class Engine {
    Engine() {
        System.out.println("Engine Created");
    }
}
class Car {
    Engine engine = new Engine();
    Car() {
        System.out.println("Car Created");
    }
}
public class Main {
    public static void main(String[] args) {
        Car car = new Car();
    }
}