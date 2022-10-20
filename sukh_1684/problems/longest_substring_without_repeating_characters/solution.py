class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        n = len(s)
        used = {}
        start = 0
        res = 0
        for i,e in enumerate(s):
            if e in used and used[e] >= start:
                res = max(res,i-start)
                start = used[e] + 1
            
            used[e] = i
            
        return max(res,n-start)