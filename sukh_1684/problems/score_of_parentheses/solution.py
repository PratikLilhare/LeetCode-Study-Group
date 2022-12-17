class Solution:
    def scoreOfParentheses(self, s: str) -> int:
        ans = bal = 0

        for i,e in enumerate(s):
            if e == '(':
                bal += 1
            else:
                bal -= 1
                if s[i-1] == '(':
                    ans += 1 << bal

        
        return ans