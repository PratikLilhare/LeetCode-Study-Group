class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        start = 0
        total=  nums[0]
        max_total = nums[0]
        for index in range(1,len(nums)):
            if (nums[index] < 0):
                if (total > abs(nums[index])):
                    max_total =  max(max_total,total)
                    total += nums[index]
                else :
                    max_total =  max(max_total,total)
                    start = index
                    total = nums[index]
            else :
                total += nums[index]
                
            while (start < index and nums[start] < 0):
                total -= nums[start]
                start +=1
        
        
        return max(max_total,total)
        
        
