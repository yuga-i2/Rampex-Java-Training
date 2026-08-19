import java.util.ArrayList;
public class RemovingDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5, 5, 6};
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();

        for (int i : arr) {
            a.add(i);
        }
        for (int i = 0; i < a.size(); i++) {
            boolean dup = false;
            for (int j = 0; j < b.size(); j++) {
                if (a.get(i).equals(b.get(j))) {
                    dup = true;
                    break;
                }
            }
            if (!dup) {
                b.add(a.get(i));
            }
        }
        System.out.println("Original : " + a);
        System.out.println("Without Duplicates : " + b);
    }
}