import java.util.*;

public class GroupWords {
    public static void main(String[] args) {

        String[] words = {"Java","API","Spring","Collection","Map","Queue"};

        Map<Integer, List<String>> map = new TreeMap<>();

        for(String word : words){

            map.putIfAbsent(word.length(), new ArrayList<>());
            map.get(word.length()).add(word);
        }

        System.out.println(map);
    }
}