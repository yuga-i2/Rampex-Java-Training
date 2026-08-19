public class Main {
    public static void main(String[] args) {

        Restaurant r1 = new Restaurant(1, "A2B", "Chennai", 4.5);
        Restaurant r2 = new Restaurant(1, "A2B", "Chennai", 4.5);

        System.out.println(r1);
        System.out.println(r2);

        System.out.println(r1.equals(r2));
    }
}