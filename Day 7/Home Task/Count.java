class EvenOddCount {
    public static void main(String[] args) {
        int[] arr = {12, 5, 8, 7, 10, 3};
        int even = 0;
        int odd = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0)
                even++;
            else
                odd++;
        }
        System.out.println("Even Count = " + even);
        System.out.println("Odd Count = " + odd);
    }
}