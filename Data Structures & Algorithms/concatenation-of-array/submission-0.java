class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] merged = new int[2 * nums.length];

        for (int i = 0; i < nums.length; i++) {
            merged[i] = nums[i];
            merged[i + nums.length] = nums[i];
        }

        return merged;
    }
}