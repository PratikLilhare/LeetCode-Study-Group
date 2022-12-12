class Solution:
    def minRemoveToMakeValid(self, s: str) -> str:
        l = list(s)
        bal = 0
        for i,e in enumerate(l):
            if e == '(':
                bal += 1
            if e == ')':
                bal -= 1

            if bal < 0 :
                l[i] = ""
                bal += 1

        while (bal > 0):
            if l[i] == '(':
                l[i] = ''
                bal -= 1
            
            i -= 1
        


        return ''.join(l)

        