import java.util.Arrays;

class MoveZeroes {
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 0, 3, 4, 0, 5};
        int[] newArr = new int[arr.length];
        int k = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != 0) {
                newArr[k] = arr[i];
                k++;
            }
        }
        System.out.println(Arrays.toString(newArr));
    }
}