class Factorial {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fun(n));
    }
    public static int fun(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * fun(n - 1);
    }
}