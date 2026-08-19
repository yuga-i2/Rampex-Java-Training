import java.util.*;

public class MaxOccurrence {
    public static void main(String[] args) {

        String str = "success";

        Map<Character, Integer> map = new HashMap<>();

        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        char maxChar = ' ';
        int max = 0;

        for (char ch : map.keySet()) {
            if (map.get(ch) > max) {
                max = map.get(ch);
                maxChar = ch;
            }
        }

        System.out.println(maxChar + " = " + max);
    }
}