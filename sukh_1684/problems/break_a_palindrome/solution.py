class Solution:
    def breakPalindrome(self, palindrome: str) -> str:
        n = len(palindrome)
        if n == 1:
            return ""
        res = ""

        cnt = 0
        for e in palindrome:
            if e == 'a':
                cnt += 1
        
        if cnt >= n-1:
            return palindrome[:-1]+'b'


        for i,e in enumerate(palindrome):
            if e == 'a':
                res += e
            else:
                res += 'a'
                if i != n-1:
                    res += palindrome[i+1:]
                break




        return res
    
        
    