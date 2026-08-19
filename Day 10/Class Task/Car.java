class Car {
    String brand;
    String model;
    String colour;
    public void drive() {
        System.out.println("Driving");
    }
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.brand = "Toyota";
        c1.model = "Fortuner";
        c1.colour = "Black";
        c1.drive();
    }
}