class Car {
    void start() {
        System.out.println("Car Started");
    }
}
class SportsCar extends Car {
    void start() {
        System.out.println("Sports Car Started");
    }
}
public class Main {
    public static void main(String[] args) {
        Car car = new SportsCar();
        car.start();
    }
}