class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashSet<Integer> set= new HashSet<>();
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(!set.contains(nums[i]))
            {
                set.add(nums[i]);
            }
            else
            list.add(nums[i]);
        }
        return list;
        
    }
}