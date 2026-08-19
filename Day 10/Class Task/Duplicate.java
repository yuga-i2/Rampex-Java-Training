class DuplicateStrings {
    public static void main(String[] args) {
        String[] arr = {"Sam", "Jame", "Sam", "Tom","Sam"};
        for(int i = 0; i < arr.length; i++) {
            boolean found = false;
            for(int k = 0; k < i; k++) {
                if(arr[i].equals(arr[k])) {
                    found = true;
                    break;
                }
            }
            if(found) {
                continue;
            }
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i].equals(arr[j])) {
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
    }
}