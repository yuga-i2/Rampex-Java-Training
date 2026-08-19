import java.util.*;
import java.util.stream.*;
public class Starting{
    public static void main(String[] args) {

        String[] names = {"Arun","Bala","Ajay","Kiran","Akash","Vignesh"};

        List<String> list = Arrays.stream(names)
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());

        System.out.println(list);
    }
}