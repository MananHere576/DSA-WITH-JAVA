class Solution {
    public int[] rearrangeArray(int[] nums) {
        int p[]=new int[nums.length/2];
        int n[]=new int[nums.length/2];
        int k=0,g=0,f=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<0)
            n[k++]=nums[i];
            else
            p[g++]=nums[i];
        }
        for(int i=0;i<nums.length/2;i++)
        {
            nums[f++]=p[i];
            nums[f++]=n[i];
        }
        return nums;
    }
}