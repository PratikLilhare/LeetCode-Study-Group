class Solution:
    def generateParenthesis(self, n: int) -> List[str]:
        temp = [[''],['()']]
        for i in range (2,n+1):
            temp.append([])
            p = 2*i
            for j in range (p,1,-2):
                index = int((j-2)/2)
                s = ['('+k+')' for k in temp[index]]
                for element in s:
                    index = int((p-j)/2)
                    for k in  temp[index]:
                        temp[i].append(element+k)
                    
        
        
        
        return temp[n]
                
                
                
                
                
                
                
            
            
        
                
            
            
            
            
        