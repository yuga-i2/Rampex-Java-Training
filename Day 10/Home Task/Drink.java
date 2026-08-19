public class Drink {
    int drinkId;
    String drinkName;
    int price;
    int stock;
    static String shopName = "Cool Drinks Shop";
    public Drink(int drinkId, String drinkName, int price, int stock) {
        this.drinkId = drinkId;
        this.drinkName = drinkName;
        this.price = price;
        this.stock = stock;
    }
    public void display() {
        System.out.println(drinkId + " " + drinkName + " Rs." + price + " Stock: " + stock);
    }
    public boolean checkStock(int qty) {
        return stock >= qty;
    }
    public int purchase(int qty) {
        stock -= qty;
        return qty * price;
    }
}