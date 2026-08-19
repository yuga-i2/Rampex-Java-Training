class Solution {
    public int getLucky(String s, int k) {
        StringBuilder num = new StringBuilder();
        for (char c : s.toCharArray()) {
            num.append(c - 'a' + 1);
        }
        String str = num.toString();
        while (k-- > 0) {
            int sum = 0;
            for (char c : str.toCharArray()) {
                sum += c - '0';
            }
            str = String.valueOf(sum);
        }
        return Integer.parseInt(str);
    }
}