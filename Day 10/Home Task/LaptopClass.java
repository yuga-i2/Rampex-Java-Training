class Laptop {
    String brand;
    String model;
    int ram;
    int memory;
    Laptop(String brand, String model, int ram, int memory) {
        this.brand = brand;
        this.model = model;
        this.ram = ram;
        this.memory = memory;
    }
    void installApp(String appName) {
        if (ram > 0) {
            ram--;
            System.out.println(appName + " is installed in " + brand + " " + model);
            System.out.println("RAM available : " + ram + " GB");
        } else {
            System.out.println("Not enough RAM.");
        }
    }
    public static void main(String[] args) {
        Laptop lap = new Laptop("Lenovo", "12", 8, 256);
        lap.installApp("Chrome");
        lap.installApp("VS Code");
        lap.installApp("WhatsApp");
        lap.installApp("Spotify");
        lap.installApp("Brave");
    }
}