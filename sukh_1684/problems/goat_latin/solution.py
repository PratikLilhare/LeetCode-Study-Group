class Solution:
    def toGoatLatin(self, s: str) -> str: 
        s = s + ' '
        res  = ''
        vowels = {'a','e','i','o','u','A','E','I','O','U'}
        pointer = 0
        counter = 0
        
        def getA(counter):
            res = ''
            for i in range(counter):
                res += 'a'
            return res
                
            
        for index,e in enumerate(s):
            if e == ' ':
                counter += 1
                word = s[pointer:index]
                if word[0] in vowels:
                    word += 'ma' + getA(counter)
                    
                else:
                    word = word[1:]+ word[0] + 'ma' + getA(counter)
                word += ' '
                res += word
                pointer = index + 1
        return res[:-1]


                