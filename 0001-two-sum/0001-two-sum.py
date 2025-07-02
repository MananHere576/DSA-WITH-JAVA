class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        n=len(nums)

        for i in range(n):
            a=nums[i]
            diff=target-a
            j=i+1
            for j in range(j,n):
                if(diff==nums[j]):
                    return [i,j]
        return           
        
        
        