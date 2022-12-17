class Solution:
    def largeGroupPositions(self, s: str) -> List[List[int]]:
        s = s+'#'
        res = []
        if len(s) < 3:
            return res
        l = 0
        start = 0
        prev = s[0]
        for ch in s[1:]:
            if ch == prev:
                l +=1
            else:
                if l >= 2:
                    end = start+l
                    res.append([start,end]) 
                start +=  l + 1
                l = 0
                
            prev = ch
        
        return res
            
        
        