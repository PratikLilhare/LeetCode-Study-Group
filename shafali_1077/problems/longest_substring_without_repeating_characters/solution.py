class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        start = 0
        res = 0
        chars = {}
        
        for i in range(len(s)):
            if s[i] in chars and chars[s[i]] >= start:
                start = chars[s[i]] + 1
            chars[s[i]] = i
            res = max(res, i-start+1)
        return res