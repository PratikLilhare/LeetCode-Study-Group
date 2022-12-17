class Solution:


    def maximumSubarraySum(self, nums: List[int], k: int) -> int:
        d = {}
        curr = 0
        res = 0
        total = 0

        for i,e in enumerate(nums):
            total += e
            if e in d and d[e] >= curr:
                total -= sum(nums[curr:d[e]+1])
                curr = d[e]+1

            if (i-curr+1 == k):
                res = max(res,total)
                total -= nums[curr]
                curr += 1
                
            d[e] = i


        
        return res