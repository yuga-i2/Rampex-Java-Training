import java.util.*;
import java.util.stream.*;

public class RemoveDuplicates {
    public static void main(String[] args) {

        int[] arr = {10,20,30,20,40,10,50,30};

        List<Integer> list = Arrays.stream(arr)
                .boxed()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(list);
    }
}