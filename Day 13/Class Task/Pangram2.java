public class Pangram2{
    public static void main(String[] args) {
        String s = "The quick brown fox jumps over the lazy dog";
        s = s.toLowerCase();
        boolean[] letters = new boolean[26];
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch >= 'a' && ch <= 'z') {
                letters[ch - 'a'] = true;
            }
        }
        boolean pangram = true;
        for(int i = 0; i < 26; i++) {
            if(!letters[i]) {
                pangram = false;
                break;
            }
        }
        if(pangram)
            System.out.println("Pangram");
        else
            System.out.println("Not a Pangram");
    }
}