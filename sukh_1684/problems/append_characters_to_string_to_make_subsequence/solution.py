class Solution:
    def appendCharacters(self, s: str, t: str) -> int:
        len_t = len(t)
        j = 0
        for i in s:
            if i == t[j]:
                if j+1 == len_t:
                    return 0
                else:
                    j += 1
        
        return len_t - j




                

            
        
        
        
        
        
        
        
        
        
        
        
        
            
        
        
        
        
        
        