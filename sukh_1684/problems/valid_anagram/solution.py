class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        sN = len(s)
        tN = len(t)
        if sN != tN:
            return False
        s = ''.join(sorted(s))
        t = ''.join(sorted(t))
        for i in range(sN):
            if s[i] != t[i]:
                return False
        return True
