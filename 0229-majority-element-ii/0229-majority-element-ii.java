import java.util.*;

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> ans = new ArrayList<>();
        int f = 0;

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                f = map.get(nums[i]);
                map.put(nums[i], f + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

        Object[] keys = map.keySet().toArray();
        for (int i = 0; i < keys.length; i++) {
            int key = (int) keys[i];
            if (map.get(key) > Math.floor(nums.length / 3)) {
                ans.add(key);
            }
        }

        return ans;
    }
}
