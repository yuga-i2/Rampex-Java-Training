import java.util.Arrays;
class ReplaceNegative {
    public static void main(String[] args) {
        int[] arr = {5, -3, 8, -2, 10, -7};
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < 0)
                arr[i] = 0;
        }
        
        System.out.println(Arrays.toString(arr));
    }
}