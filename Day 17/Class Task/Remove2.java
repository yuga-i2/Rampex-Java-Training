import java.util.Arrays;
public class Remove2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4};
        int newSize = removeDup2(arr);
        for (int i = 0; i < newSize; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static int removeDup2(int[] nums) {
        if (nums.length == 0)
            return 0;
        int j = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[j]) {
                j++;
                nums[j] = nums[i];
            }
        }
        return j + 1;
    }
}