public class Seating{
    public static void main(String[] args) {
        for (int row = 1; row <= 5; row++) {
            for (int seat = 1; seat <= 6; seat++) {
                System.out.print("R" + row + "S" + seat + " ");
            }
            System.out.println();
        }
    }
}