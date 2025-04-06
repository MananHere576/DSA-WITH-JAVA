import java.util.*;

class Solution {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int index = 0;

        for (int i=0;i<nums.length;i++) 
        {
            if(set.add(nums[i])) 
            {
                nums[index++] = nums[i];
            }
        }
        return index;
    }
}
