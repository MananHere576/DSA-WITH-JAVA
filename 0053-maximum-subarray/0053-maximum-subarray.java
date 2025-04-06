class Solution {
    public int maxSubArray(int[] nums) {
        int c=0;
        int max=nums[0];
        for(int i=0;i<nums.length;i++)
        {
            if(c<0)
            c=0;
            c=c+nums[i];
            max=Math.max(max,c);
        }
        return max;
    }
}