import java.util.Arrays;
class ReverseStringArray {
    public static void main(String[] args) {
        String[] menu = {"Veg", "Non-Veg", "Sweets", "Beverages"};
        String[] rev = new String[menu.length];
        for(int i = 0; i < menu.length; i++) {
            rev[i] = menu[menu.length - 1 - i];
        }
        System.out.println(Arrays.toString(rev));
    }
}