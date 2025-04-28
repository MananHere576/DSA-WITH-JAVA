class Solution {
    public int RecursiveBSearch(int l, int h, int target, int[] nums)
    {
        if(l>h)
        {
            return -1;
        }
        int mid = (l+h)/2;

        if(nums[mid] == target)
        {
            return mid;
        }
        else if(nums[mid] > target)
        {
            return RecursiveBSearch(l,mid-1,target,nums);
        }
        else
        {
            return RecursiveBSearch(mid+1,h,target,nums);
        }
    }
    public int search(int[] nums, int target) {
        return RecursiveBSearch(0,nums.length-1,target,nums);
    }
}