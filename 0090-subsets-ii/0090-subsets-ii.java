class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> narr = new ArrayList<>();
        int i=0;
        rec(i,nums,narr,ans);
        return ans;       
    }
    static void rec(int i,int[] nums,List<Integer> narr,List<List<Integer>> ans)
    {
        if(i==nums.length)
        {
            if(!ans.contains(narr))
            ans.add(new ArrayList<>(narr));
            return;
        }
        rec(i+1,nums,narr,ans);
        narr.add(nums[i]);
        rec(i+1,nums,narr,ans);
        narr.remove(narr.size()-1);
    }
}