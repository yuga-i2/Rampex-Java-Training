import java.util.Scanner;
class ReverseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 3-digit number: ");
        int num = sc.nextInt(); 
        int rev = (num % 10) * 100 + ((num / 10) % 10) * 10 + (num / 100);
        System.out.println("Reversed Number = " + rev);
        sc.close();
    }
}