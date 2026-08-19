import java.util.*;

public class DuplicateWords {
    public static void main(String[] args) {

        String sentence = "java is easy and java is powerful and java is popular";

        String[] words = sentence.split(" ");

        Set<String> set = new HashSet<>();
        Set<String> duplicate = new LinkedHashSet<>();

        for (String word : words) {

            if (!set.add(word)) {
                duplicate.add(word);
            }
        }

        System.out.println(duplicate);
    }
}