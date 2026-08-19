import java.util.*;
import java.util.stream.*;
public class MostFrequentWord{
    public static void main(String[] args) {
        String sentence = "java python java spring java python";
        Map<String, Long> map = Arrays.stream(sentence.toLowerCase().split(" "))
                .collect(Collectors.groupingBy(
                        word -> word,
                        Collectors.counting()
                ));
        Map.Entry<String, Long> result = map.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .get();
        System.out.println(result.getKey() + " -> " + result.getValue());
    }
}