class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        pointer = 0
        n = len(s)
        while (pointer < n):
            temp = s[pointer]
            if temp in ['(','{','[']:
                stack.append(temp)
            else:
                if not stack:
                    return False
                e = stack.pop()
                if temp == ')' and e != '(':
                    return False
                elif temp == '}' and e != '{':
                    return False
                elif temp == ']' and e != '[':
                    return False
                
            pointer += 1
        
        return (not stack)

        
            
            