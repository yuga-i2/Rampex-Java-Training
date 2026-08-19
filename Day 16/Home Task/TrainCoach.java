import java.util.*;

public class TrainCoach {
    public static void main(String[] args) {

        LinkedList<String> train = new LinkedList<>();

        train.addFirst("Engine");
        train.addLast("Coach1");
        train.addLast("Coach2");
        train.addLast("Guard");

        train.removeLast();

        System.out.println(train);
    }
}