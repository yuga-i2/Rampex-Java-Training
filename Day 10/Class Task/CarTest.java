public class CarTest {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car();
        Car c3 = new Car();
        c1.accelerate();
        c1.accelerate();
        c1.brake();
        c2.brand = "Audi";
        c2.accelerate();
        c2.accelerate();
        c2.accelerate();
        c2.accelerate();
        c2.accelerate();
        c2.accelerate();
        c2.accelerate();
        c2.accelerate();
        c2.accelerate();
        c2.brake();
        c2.brake();
        c2.brake();
        c2.brake();
        c3.brand = "Benz";
        c3.accelerate();
        c3.brake();
    }
}
class Car {
    String brand = "BMW";
    String model = "M5";
    int speed = 0;
    int maxSpeed = 40;
    public void accelerate() {
        if(speed == maxSpeed) {
            System.out.println(brand + " is already at maximum speed (" + maxSpeed + " km)");
        }
        else {
            speed = speed + 5;
            if(speed > maxSpeed) {
                speed = maxSpeed;
            }
            System.out.println(brand + " car is driving at : " + speed + " km speed");
        }
    }
    public void brake() {
        if(speed == 0) {
            System.out.println("Vehicle is not moving");
        }
        else {
            speed = speed - 5;
            System.out.println(brand + " brake applied speed : " + speed + " km");
        }
    }
}