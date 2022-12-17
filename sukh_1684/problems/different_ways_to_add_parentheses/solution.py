class Solution:
    def diffWaysToCompute(self, expression: str) -> List[int]:


        def calc(a,b,op):
            if op == '+':
                temp =  a+b
            elif op == '-':
                temp =  a-b
            else:
                temp = a*b
            
            return temp

        @cache
        def helper(expression):
            if (expression.isdigit()):
                return [int(expression)]
            k = []
            for i,e in enumerate(expression):
                if not e.isdigit():
                    a = helper(expression[:i])
                    b = helper(expression[i+1:])
                    k.extend([calc(m,n,e) for m in a for n in b])
   
            return k
            
                
       



        return helper(expression)

    

