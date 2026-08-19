class Solution {
    public int countConsistent(String allowed, String[] words) {

        boolean[] check = new boolean[26];

        for(char ch : allowed.toCharArray())
            check[ch - 'a'] = true;

        int count = 0;

        for(String word : words) {

            boolean ok = true;

            for(char ch : word.toCharArray()) {

                if(!check[ch - 'a']) {
                    ok = false;
                    break;
                }
            }

            if(ok)
                count++;
        }

        return count;
    }
}