class Solution:
    def mctFromLeafValues(self, arr: List[int]) -> int:
        stack = [float('inf')]
        n = len(arr)
        res = 0
        for i in arr:
            if i < stack[-1]:
                stack.append(i)
            else :
                #current element is greater than last in stack
                temp = stack.pop()
                res += temp* min(stack[-1],i)
                while stack[-1]  < i:
                    temp = stack.pop()
                    res += temp* min(stack[-1],i)
                stack.append(i)
                    
                
        while len(stack) > 2 :
            temp = stack.pop()
            res += temp * stack[-1]
            
        return res
            
                
                
                
                
            
            