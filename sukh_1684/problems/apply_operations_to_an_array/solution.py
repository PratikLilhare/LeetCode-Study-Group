class Solution:
    def applyOperations(self, nums: List[int]) -> List[int]:
        n = len(nums)
        i = 0
        res = []
        while(i< n-1):
            if nums[i] == 0:
                i += 1
            elif nums[i] == nums[i+1]:
                nums[i] *= 2
                nums[i+1] = 0
                res.append(nums[i])
                i = i+2
            else:
                res.append(nums[i])
                i += 1
        if nums[n-1] != 0:
            res.append(nums[n-1])
        resN = len(res)
        res = res + [0]*(n-resN)
            
            
   
        return res
        