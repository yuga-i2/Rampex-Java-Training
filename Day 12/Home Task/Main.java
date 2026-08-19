class Car {
    Car() {
        System.out.println("Car Constructor");
    }
}
class SportsCar extends Car {
    SportsCar() {
        System.out.println("SportsCar Constructor");
    }
}
public class Main {
    public static void main(String[] args) {
        SportsCar car = new SportsCar();
    }
}