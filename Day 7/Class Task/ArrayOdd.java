import java.util.Arrays;
class ArrayOdd {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for(int i = 0; i < arr.length; i = i + 2) {
            arr[i] = 2 * i + 1;
        }
        System.out.println(Arrays.toString(arr));
    }
}