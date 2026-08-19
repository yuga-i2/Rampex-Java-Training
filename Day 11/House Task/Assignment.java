public class Assignment {
    public static void main(String[] args) {
        int a = 10;
        int b = (a = 20) + a;
        System.out.println(a);
        System.out.println(b);
    }
}
