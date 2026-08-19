import java.util.*;

public class FirstRepeated {
    public static void main(String[] args) {

        String str = "programming";

        Set<Character> set = new HashSet<>();

        for (char ch : str.toCharArray()) {

            if (set.contains(ch)) {
                System.out.println(ch);
                break;
            }

            set.add(ch);
        }
    }
}