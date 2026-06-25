import java.util.Scanner;
class OddSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int product = 1;
        for (int i = 3; i <= n - 2; i += 2) {
            product *= i;
        }
        System.out.println("Product = " + product);
        sc.close();
    }
}