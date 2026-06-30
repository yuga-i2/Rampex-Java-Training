class MissingNumber {
    public static void main(String[] args) {
        int n = 8;
        int[] arr = {1, 2, 4, 5, 6, 7, 8};
        int total = n * (n + 1) / 2;
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Missing Number = " + (total - sum));
    }
}