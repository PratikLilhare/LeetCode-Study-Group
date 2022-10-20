class Solution:
    def romanToInt(self, s: str) -> int:
        symbol = {'I':1,'V':5,'X':10,'L':50,'C':100,'D':500,'M':1000,'IV':4,'IX':9,'XL':40,'XC':90,'CD':400,'CM':900}
        p = 0
        res = 0
        n = len(s)
        while(p < n):
            if p+1 < n and s[p:p+2] in symbol:
                res += symbol[s[p:p+2]]
                p +=2
            else :
                res += symbol[s[p:p+1]]
                p += 1
                
        return res
        
        