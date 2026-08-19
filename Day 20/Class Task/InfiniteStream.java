import java.util.stream.Stream;

public class InfiniteStream {
    public static void main(String[] args) {

        Stream<String> s = Stream.of("Keerthi", "Akhila", "Yuga", "Gowri");

        s.map(n -> n.toUpperCase())
         .forEach(System.out::println);
    }
}