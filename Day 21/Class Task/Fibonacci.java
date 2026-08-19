class Fibonacci {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 0; i < n; i++) {
            System.out.print(fun(i) + " ");
        }
    }
    public static int fun(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        return fun(n - 1) + fun(n - 2);
    }
}      