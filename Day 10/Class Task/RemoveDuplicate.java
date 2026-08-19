import java.util.Arrays;
class RemoveDuplicateStrings {
    public static void main(String[] args) {
        String[] arr = {"Sam", "Jame", "Sam", "Tom"};
        String[] unique = new String[arr.length];
        int k = 0;
        for(int i = 0; i < arr.length; i++) {
            boolean duplicate = false;
            for(int j = 0; j < k; j++) {
                if(arr[i].equals(unique[j])) {
                    duplicate = true;
                    break;
                }
            }
            if(!duplicate) {
                unique[k] = arr[i];
                k++;
            }
        }
        for(int i = 0; i < k; i++) {
            System.out.println(unique[i]);
        }
    }
}