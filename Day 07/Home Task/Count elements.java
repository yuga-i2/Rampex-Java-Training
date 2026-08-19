class GreaterThanAverage {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double average = (double)sum / arr.length;
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > average)
                count++;
        }
        System.out.println("Average = " + average);
        System.out.println("Count = " + count);
    }
}