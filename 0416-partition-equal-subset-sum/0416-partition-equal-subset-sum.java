class Solution {
    public boolean canPartition(int[] nums) {
        int tot=0;
        for(int i=0;i<nums.length;i++) 
        {
            tot=tot+nums[i];
        }
        if(tot%2!=0) 
            return false;
        int sum=tot/2;
        boolean[] arr = new boolean[sum+1];
        arr[0]=true; 
        for(int i=0;i<nums.length;i++) 
        {
            int num=nums[i];
            for(int j=sum;j>=num;j--) 
            {
                if(arr[j-num]) 
                {
                    arr[j] = true;
                }
            }
        }
        return arr[sum];
    }
}
