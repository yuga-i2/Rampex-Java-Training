import java.util.*;
import java.util.stream.*;

public class SecondHighest {
    public static void main(String[] args) {

        int[] arr = {12,45,23,89,67,89,34};

        int second = Arrays.stream(arr)
                .boxed()
                .distinct()
                .sorted(Collections.reverseOrder())
                .skip(1)
                .findFirst()
                .get();

        System.out.println(second);
    }
}