class Solution:
    def arithmeticTriplets(self, nums: List[int], diff: int) -> int:
        count = 0
        s = set(nums)
        for e in nums:
            if e + diff in s and e + 2 * diff in s:
                count +=1
        return count
                
        