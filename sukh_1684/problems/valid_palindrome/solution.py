class Solution:
    def isPalindrome(self, s: str) -> bool:
        s = s.lower()
        temp = ''
        for char in s:
            if 97 <= ord(char) <= 122 or 48 <= ord(char) <= 57:
                temp += char
                
        n = len(temp)
        last = n -1
        anchor = 0
        while (anchor <= last):
            while(anchor <= last and not(97 <= ord(temp[anchor]) <= 122 or 48 <= ord(temp[anchor]) <= 57)):
                anchor += 1
            while(anchor <= last and not(97 <= ord(temp[last]) <= 122 or 48 <= ord(temp[last]) <= 57)):
                last -= 1
            if anchor > last:
                break
            if temp[anchor] != temp[last]:
                return False
            anchor += 1
            last -= 1
            
                
        
        
        return True