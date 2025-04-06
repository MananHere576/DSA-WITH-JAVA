class Solution {
    public int[] productExceptSelf(int[] nums) {
        int pref[] = new int[nums.length];
        int postf[] = new int[nums.length];
        int ans[] = new int[nums.length];

        for (int i=0; i<nums.length;i++) 
        {
            if (i==0)
                pref[i]=1;
            else
                pref[i]=nums[i-1]*pref[i-1];
        }
        for (int i=nums.length-1;i>=0;i--) 
        {
            if (i==nums.length-1)
                postf[i] = 1; 
            else
                postf[i]=nums[i+1]*postf[i+1];
        }

        for (int i=0;i<nums.length;i++) 
        {
            ans[i]=pref[i]*postf[i];
        }

        return ans;
    }
}
