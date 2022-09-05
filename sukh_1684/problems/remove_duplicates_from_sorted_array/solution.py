class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        current = 0
        length = len(nums)
        for i in range(1,length):
            if(nums[i] > nums[current]):
                current += 1
                nums[i], nums[current] = nums[current], nums[i]
        
                
            
            
        
        return current+1