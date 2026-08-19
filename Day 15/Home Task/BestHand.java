class Solution {
    public String bestHand(int[] ranks, char[] suits) {

        boolean flush = true;

        for(int i = 1; i < suits.length; i++) {
            if(suits[i] != suits[0]) {
                flush = false;
                break;
            }
        }

        if(flush)
            return "Flush";

        int[] freq = new int[14];
        int max = 0;

        for(int r : ranks) {
            freq[r]++;
            max = Math.max(max, freq[r]);
        }

        if(max >= 3)
            return "Three of a Kind";
        if(max == 2)
            return "Pair";

        return "High Card";
    }
}