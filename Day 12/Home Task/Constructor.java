class Car {
    Car() {
        System.out.println("Car Ready");
    }
    void display() {
        System.out.println("Normal Car");
    }
}
class SportsCar extends Car {
    void display() {
        System.out.println("Sports Car");
    }
}
public class Main {
    public static void main(String[] args) {
        SportsCar car = new SportsCar();
        car.display();
    }
}