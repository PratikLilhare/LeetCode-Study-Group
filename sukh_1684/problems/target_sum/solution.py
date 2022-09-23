class Solution:
    def findTargetSumWays(self, nums: List[int], target: int) -> int:
        n = len(nums)
        
        memo = {}
        def dice(i,total):
            if i == n-1:
                return [0,1][total == target]
            elif (i,total) in memo :
                return memo[(i,total)]
            memo[(i,total)] = dice(i+1,total + nums[i]) + dice(i+1,total - nums[i])
            return memo[(i,total)]
                
            
        return dice(-1,0)