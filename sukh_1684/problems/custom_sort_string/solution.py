class Solution:
    def customSortString(self, order: str, s: str) -> str:

        d = {}

        res = ""
        for i in s:
            if i in d:
                d[i] += 1
            else:
                d[i] = 1
        
        for i in order:
            if i in d:
                while(d[i] != 0):
                    res = res + i
                    d[i] -= 1
            
        for key in d:
            if d[key] != 0:
                while(d[key] !=0):
                    res = res + key
                    d[key] -= 1


        return res