class Solution:
    def isStrictlyPalindromic(self, n: int) -> bool:
        for i in range(2,n-1):
            s = self.baseConverter(n,i)
            reverseS = s[::-1]
            if s != reverseS:
                return False
        
        
        return True
    
    def baseConverter(self,n,i):
        s = ''
        while(n > 0):
            s = str(n%i) + s
            n = n/i
            
        return s
        