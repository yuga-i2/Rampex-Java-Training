import java.util.*;
import java.util.stream.*;

public class AverageGreater {
    public static void main(String[] args) {

        int[] arr = {25,60,80,40,90,55,30,100};

        double avg = Arrays.stream(arr)
                .filter(n -> n > 50)
                .average()
                .getAsDouble();

        System.out.println(avg);
    }
}