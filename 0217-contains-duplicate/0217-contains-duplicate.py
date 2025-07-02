class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        list=set()
        for i in range(len(nums)):
            if nums[i] in list:
                return True
            else:
                list.add(nums[i]) 
        return False           

        