class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        n=len(nums)

        for i in range(n):
            a=nums[i]
            diff=target-a
            for j in range(i+1,n):
                if(diff==nums[j]):
                    return [i,j]
        return           
        
        
        