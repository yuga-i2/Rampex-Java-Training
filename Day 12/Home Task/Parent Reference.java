class Car {
    void start() {
        System.out.println("Car Started");
    }
}
class SportsCar extends Car {
    void turbo() {
        System.out.println("Turbo Enabled");
    }
}
public class Main {
    public static void main(String[] args) {
        Car car = new SportsCar();
        car.start();
        ((SportsCar) car).turbo();
    }
}