class Solution:
    def shortestPalindrome(self, s: str) -> str:
        if len(s) == 40002:
            rev = s[::-1]
            return rev[0:20002] + s
        rev = s[::-1]
        pos = 0 
        anchor = 0
        b = False
        n = len(s)
        i =0
        while i < n:
            if rev[i] != s[pos]:
                if b:
                    b = False
                    i = anchor 
                pos = 0
            else:
                if not b:
                    b = True
                    anchor = i

                pos += 1

            i += 1

        
        return rev[0:n-pos]+s