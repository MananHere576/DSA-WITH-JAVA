class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!set.contains(nums[i])) {
                set.add(nums[i]);
            }
        }

        int max = 0;
        Integer[] arr = set.toArray(new Integer[0]);

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int streak = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    streak++;
                }

                if (streak > max) {
                    max = streak;
                }
            }
        }

        return max;
    }
}
