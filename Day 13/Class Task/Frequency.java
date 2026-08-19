public class Frequency {
    public static void main(String[] args) {
        String s = "Good";
        String printed = "";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (printed.contains(String.valueOf(s.charAt(i)))) {
                continue;
            }
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    count++;
                }
            }
            System.out.println(s.charAt(i) + " : " + count);
            printed = printed + s.charAt(i);
            count = 0;
        }
    }
}