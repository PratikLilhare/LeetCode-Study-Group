class Solution:
    def isAdditiveNumber(self, num: str) -> bool:
        n = len(num)

        for i in range(1,n):
            d = num[0:i]
            if len(d) !=1 and d[0] == '0':
                continue
            for j in range(1,n-i):
                a = d
                b = num[i:i+j]
                if len(b)!= 1 and b[0] == '0':
                    continue
                c = str(int(a) + int(b))
                cStartIndex = i+j
                while (cStartIndex < n):
                    if num[cStartIndex:].find(c) != 0:
                        break
                    a,b = b,c
                    cStartIndex = cStartIndex+len(c)
                    c = str(int(a) + int(b))
                    
                if cStartIndex == n:
                    return True

 

                

        return False
        

#101
#012