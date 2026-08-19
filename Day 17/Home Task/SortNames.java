import java.util.*;

public class SortNames {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<String> list = new ArrayList<>();

        for(int i=0;i<n;i++){
            list.add(sc.next());
        }

        Collections.sort(list);
        System.out.println("Ascending : " + list);

        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Descending : " + list);
    }
}