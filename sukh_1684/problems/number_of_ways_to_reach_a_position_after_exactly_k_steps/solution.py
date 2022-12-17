class Solution:
    def numberOfWays(self, startPos: int, endPos: int, k: int) -> int:
        @cache
        def dfs(currPos, k):
            if k == 0:
                if(currPos == endPos):
                    return 1
                return 0
            return dfs(currPos-1,k-1) + dfs(currPos+1,k-1)
            
        return dfs(startPos, k) % (10**9 + 7)
        