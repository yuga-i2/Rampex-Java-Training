import java.util.Scanner;

class ItemPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] item = {"Pepsi", "Sprite", "Maaza", "Mountain Dew"};
        int[] price = {40, 10, 20, 44, 50};
        System.out.print("Enter item: ");
        String search = sc.next();
        for(int i = 0; i < item.length; i++) {
            if(item[i].equals(search)) {
                System.out.println("Price = " + price[i]);
                break;
            }
        }
        sc.close();
    }
}