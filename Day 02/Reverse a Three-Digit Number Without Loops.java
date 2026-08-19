import java.util.Scanner;
class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev = (n % 10) * 100 + ((n / 10) % 10) * 10 + (n / 100);
        System.out.println("Reverse = " + rev);
    }
}