import java.util.*;

public class BinarySearch{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<Integer> list = new ArrayList<>();

        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }

        int x = sc.nextInt();

        Collections.sort(list);

        System.out.println("Sorted List : " + list);

        int index = Collections.binarySearch(list, x);

        if(index >= 0)
            System.out.println("Element found at index " + index);
        else
            System.out.println("Element not found");
    }
}