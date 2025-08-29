class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums.length == 1) {
            List<Integer> slist = new ArrayList<>();
            slist.add(nums[0]);
            res.add(slist);
            return res;
        }

        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            int[] rnums = new int[nums.length - 1];
            int index = 0;
            for (int j = 0; j < nums.length; j++) {
                if (j != i) {
                    rnums[index] = nums[j];
                    index++;
                }
            }
            
            List<List<Integer>> perms = permute(rnums);
            for (List<Integer> p : perms) {
                p.add(n);
            }
            
            res.addAll(perms);
        }
        
        return res;        
    }
}