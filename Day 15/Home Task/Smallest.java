class Solution {
    public int smallest(int n) {

        int ans = 1;

        while (ans < n) {
            ans = (ans << 1) | 1;
        }

        return ans;
    }
}