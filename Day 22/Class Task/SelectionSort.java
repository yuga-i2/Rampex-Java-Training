import java.util.Arrays;
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 4, 5};
        selectionSort(arr);
    }
    public static int[] selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }
}