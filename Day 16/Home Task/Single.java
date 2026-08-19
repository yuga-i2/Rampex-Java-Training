class Solution {
    public int single(int[] nums) {

        int ans = 0;

        for(int num : nums) {
            ans ^= num;
        }

        return ans;
    }
}