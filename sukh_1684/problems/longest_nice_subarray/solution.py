class Solution:
    def longestNiceSubarray(self, nums: List[int]) -> int:
        left = 0
        product = 0
        maxLength = 1
        for index,e in enumerate(nums):
            if e & product == 0 :
                product |= e
            else :
                maxLength = max(maxLength, index - left)
                while (left < index and e & product != 0):
                    product &= ~nums[left]
                    left += 1
                product |= e
            
        return max(maxLength, len (nums) - left)
                
        