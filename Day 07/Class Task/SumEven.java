import java.util.Scanner;

class EvenPositionSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            System.out.print("Enter element at position " + i + ": ");
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < arr.length; i++) {
            if(i % 2 == 0) {
                sum += arr[i];
            }
        }
        System.out.println("Sum of even positions = " + sum);
        sc.close();
    }
}