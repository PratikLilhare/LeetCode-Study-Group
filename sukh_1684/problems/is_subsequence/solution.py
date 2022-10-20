class Solution:
    def isSubsequence(self, s: str, t: str) -> bool:
        n = len(s)
        pointer = 0
        for ch in t:
            if pointer == n:
                break
            if ch == s[pointer]:
                pointer += 1
        
        
        
        return pointer == n
        