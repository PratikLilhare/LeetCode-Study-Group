class Solution:
    def longestCommonSubsequence(self, text1: str, text2: str) -> int:
        l1 = len(text1)
        l2 = len(text2)
        prev = 0
        dp = [[0] * (l2+1) for _ in range(2)]
        for i in range(l1):
            for j in range(l2):
                if text1[i] == text2[j]:
                    dp[1][j+1] = dp[0][j] + 1
                else:
                    dp[1][j+1] = max(dp[1][j],dp[0][j+1])
    
            for k in range(l2):
                dp[0][k+1]  = dp[1][k+1]

        return dp[1][l2]
        