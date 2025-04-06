class Solution {
    public boolean check(int[] nums) {
        boolean flag = true;
        int p = -1;  
        int x = nums[0];

        for (int i=1;i<nums.length;i++) {
            if (nums[i-1]>nums[i]) { 
                p=i;
                break;
            }
        }

        if (p!=-1) {  
            for (int i=p;i<nums.length-1;i++) {
                if (nums[i]>nums[i+1]) {
                    flag = false;
                    break;
                }
            }
            if (nums[nums.length-1]>x) {  
                flag = false;
            }
        }

        return flag;
    }
}
