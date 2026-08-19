class DuplicateStrings {
    public static void main(String[] args) {
        String[] arr = {"Sam", "Jame", "Sam", "Tom"};
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i].equals(arr[j])) {
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
    }
}