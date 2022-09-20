class Solution:
    def uniquePaths(self, m: int, n: int) -> int:
        dp = [1] * n
        left = 1
        for i in range(n):
            dp[i] = 1
        for i in range(1,m):
            for j in range(n):
                if not j:
                    left = 1
                    continue
                dp[j] += left
                left = dp[j]
        
        return dp[n-1]