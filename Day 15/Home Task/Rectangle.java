import java.util.*;

class Solution {
    public long Rectangle(int[][] rectangles) {

        HashMap<Double, Long> map = new HashMap<>();

        long count = 0;

        for (int[] rect : rectangles) {

            double ratio = (double) rect[0] / rect[1];

            long freq = map.getOrDefault(ratio, 0L);

            count += freq;

            map.put(ratio, freq + 1);
        }

        return count;
    }
}