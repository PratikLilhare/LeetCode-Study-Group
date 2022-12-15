class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        d = {}
        for i in range(len(nums)):
            if d.get(nums[i]) is not None and 2*nums[i] == target:
                return [d[nums[i]], i]
            d[nums[i]] = i
    
        nums.sort()
        i = 0
        j = len(nums)-1
        
        while i<j:
            if nums[i]+nums[j] > target:
                j -= 1
            elif nums[i]+nums[j] < target:
                i += 1
            else:
                return [d[nums[i]], d[nums[j]]]