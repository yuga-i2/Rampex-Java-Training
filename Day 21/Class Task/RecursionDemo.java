class RecursionDemo {
    static int sum = 0;

    public static void main(String[] args) {
        fun(5);
        System.out.println(sum);
    }
    public static void fun(int n) {
        if (n == 0) {
            return;
        }
        sum += n;
        fun(n - 1);
    }
}