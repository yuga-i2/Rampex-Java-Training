import java.util.Arrays;
import java.util.Scanner;
class ArrayInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i = 0; i < 5; i++) {
            System.out.print("Enter element at position " + (i+1) + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        sc.close(); 
    }
}