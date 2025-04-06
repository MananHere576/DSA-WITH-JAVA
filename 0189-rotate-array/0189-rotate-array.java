class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;  
        int arr[] = new int[n];
        int p = 0;
        for (int i=n-k;i<n;i++) 
        {
            arr[p++] = nums[i];
        }
        for (int i=0;i<n-k;i++) 
        {
            arr[p++] = nums[i];
        }
        for (int i=0;i<n;i++) 
        {
            nums[i] = arr[i];
        }
    }
}
