class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        prefix = strs[0]
        n = len(strs)
        for i in range(1,n):
            s = min(len(prefix),len(strs[i]))
            prefix = prefix[:s]
            for j in range(s):
                if (strs[i][j] != prefix[j]):
                    prefix = prefix[:j]
                    break
                    
        return prefix