import java.util.*;

public class ContainsDuplicate {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 1};

        Set<Integer> set = new HashSet<>();

        boolean duplicate = false;

        for (int num : nums) {
            if (set.contains(num)) {
                duplicate = true;
                break;
            }
            set.add(num);
        }

        System.out.println(duplicate);
    }
}