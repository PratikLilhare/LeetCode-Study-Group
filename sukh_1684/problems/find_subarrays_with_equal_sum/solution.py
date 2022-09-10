class Solution:
    def findSubarrays(self, nums: List[int]) -> bool:
        l = []
        for i in range(0,len(nums)-1,2):
            total = nums[i] + nums[i+1]
            if total in l:
                return True
            l.append(total)
        for i in range(1,len(nums)-1,2):
            total = nums[i] + nums[i+1]
            if total in l:
                return True
            l.append(total)

        return False
        
            
            
        