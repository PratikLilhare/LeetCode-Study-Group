class Solution:
    def mctFromLeafValues(self, arr: List[int]) -> int:
        #monotonic stack
        stack = [float('inf')]
        res = 0
        for nums in arr:
            while stack and stack[-1] <= nums:
                curr = stack.pop()
                res += curr * min(stack[-1], nums)  
            stack.append(nums)
            
        while len(stack) > 2:
            res += stack.pop() * stack[-1]
        
        return res
            
            
                