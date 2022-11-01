class Solution:
    def partition(self, s: str) -> List[List[str]]:
        n = len(s)
        
        res = []
        def partFinder(string,l):
            if not string:
                return
            
            
            n = len(string)
            if n == 1 or palindromeTest(string):
                copy = l.copy()
                copy.append(string)
                res.append(copy)

            for i in range(1,n+1):
                a = string[0:i]
                b = string[i:n]
                if palindromeTest(a):
                        copy = l.copy()
                        copy.append(a)
                        partFinder(b,copy)
                    



                
                     
        def palindromeTest(string):
            last = len(string) -1
            anchor = 0
            while(anchor <= last):
                if string[anchor] != string[last]:
                    return False
                
                anchor += 1
                last -= 1
            return True
        
        partFinder(s, [])
        
        return res
            
        