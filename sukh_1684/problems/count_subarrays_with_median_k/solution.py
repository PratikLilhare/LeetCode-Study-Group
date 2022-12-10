class Solution:
    def countSubarrays(self, nums: List[int], k: int) -> int:
        n_nums = len(nums)
        index = nums.index(k)
        d = defaultdict(int)
        res = bal = 0

        for i in range(index,n_nums):
            if nums[i] > k:
                bal += 1
            if nums[i] < k:
                bal -= 1
            
            d[bal] += 1
            if bal == 0 or bal == 1:
                res += 1

        bal = 0  
        for i in reversed(range(index)):
            if nums[i] > k:
                bal += 1
            if nums[i] < k:
                bal -= 1
            
            res += d[-bal] + d[-bal+1]

        return res




        