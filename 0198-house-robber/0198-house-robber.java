class Solution {
    public int rob(int[] nums) {
        int res[] = new int[nums.length];
        int P1=0,P2=0;
        for(int i=0;i<nums.length;i++)
        {
            res[i]=Math.max(P1+nums[i],P2);
            P1=P2;
            P2=res[i];
        }
        return res[nums.length-1];
    }
}