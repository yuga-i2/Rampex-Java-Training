public class ShortCircuit {
    public static void main(String[] args) {
        int x = 5;
        if (x > 10 && ++x > 5) {
        }
        System.out.println(x);
    }
}