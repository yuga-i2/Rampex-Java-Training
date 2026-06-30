class SecondMax {
    public static void main(String[] args) {
        int[] arr = {12, 45, 8, 67, 23};
        int max = arr[0];
        int secondMax = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > max) {
                secondMax = max;
                max = arr[i];
            }
        }
        System.out.println("Second Maximum = " + secondMax);
    }
}