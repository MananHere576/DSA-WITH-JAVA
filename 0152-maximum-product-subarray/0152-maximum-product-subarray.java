class Solution {
    public int maxProduct(int[] nums) {
        int maxProduct = nums[0], currMax = nums[0], currMin = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int temp = currMax;
            currMax = Math.max(nums[i], Math.max(currMax * nums[i], currMin * nums[i]));
            currMin = Math.min(nums[i], Math.min(temp * nums[i], currMin * nums[i]));
            maxProduct = Math.max(maxProduct, currMax);
        }

        return maxProduct;
    }
}
