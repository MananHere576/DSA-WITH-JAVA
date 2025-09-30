class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        int d=0;
        for(int i=0;i<nums.length-1;i++)
        {
            int a=nums[i+1]-nums[i];
            if(a>d)
            {
                d=a;
            }
        }
        return d;
        
    }
}