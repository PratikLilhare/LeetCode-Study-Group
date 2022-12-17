class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        temp = {}
        for i,val in enumerate(nums):
            if((target-val) in temp):
                return [temp[target-val],i]
            temp[val] = i
                
        