class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        res = ""
        for i, c in enumerate(strs[0]): 
            for s in strs[1:]: 
                if len(s)<i+1 or s[i] != c: 
                    return res
            
            res += c
            
        return res
