class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        min = float('inf')
        max = 0
        diff = 0
        ndiff = 0

        for i in range(len(prices)):
            if prices[i] < min:
                min = prices[i]
            if prices[i] - min > diff:
                diff = prices[i] - min
            if diff > ndiff:
                ndiff = diff
                
        return ndiff
