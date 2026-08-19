class LargestString {
    public static void main(String[] args) {
        String[] arr = {"Saniya", "Keerthi","Madanki","Yuga"};
        String largest = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(arr[i].length() > largest.length()) {
                largest = arr[i];
            }
        }
        System.out.println("Largest Name = "+largest);
    }
}