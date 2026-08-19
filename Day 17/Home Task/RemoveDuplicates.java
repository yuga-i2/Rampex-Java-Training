import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {

        int[] nums = {1,1,2,2,3,4,4};

        Set<Integer> set = new LinkedHashSet<>();

        for(int n : nums){
            set.add(n);
        }

        System.out.println(set);
        System.out.println("Length = " + set.size());
    }
}