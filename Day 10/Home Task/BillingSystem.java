import java.util.Scanner;
public class BillingSystem {
    public static void main(String[] args) {
        Drink[] drinks = {
                new Drink(1, "Pepsi", 30, 5),
                new Drink(2, "Sprite", 20, 5),
                new Drink(3, "Maaza", 40, 5),
                new Drink(4, "Mountain Dew", 60, 5),
                new Drink(5, "Campa", 10, 5)
        };
        Scanner sc = new Scanner(System.in);
        int totalBill = 0;
        while (true) {
            System.out.println("\nAvailable Drinks");
            for (Drink d : drinks) {
                d.display();
            }
            System.out.print("\nEnter drink name (or exit): ");
            String name = sc.nextLine();
            if (name.equalsIgnoreCase("exit")) break;
            System.out.print("Enter quantity: ");
            int qty = sc.nextInt();
            sc.nextLine();
            boolean found = false;
            for (Drink d : drinks) {
                if (d.drinkName.equalsIgnoreCase(name)) {
                    found = true;
                    if (d.checkStock(qty)) {
                        int bill = d.purchase(qty);
                        totalBill += bill;
                        System.out.println("Purchased Successfully.");
                        System.out.println("Bill = Rs." + bill);
                    } else {
                        System.out.println("Insufficient Stock.");
                    }
                    break;
                }
            }
            if (!found) {
                System.out.println("Drink Not Found.");
            }
        }
        System.out.println("\nTotal Bill = Rs." + totalBill);
        System.out.println("\nRemaining Stock");
        for (Drink d : drinks) {
            d.display();
        }
        sc.close();
    }
}