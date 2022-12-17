class Solution:
    def minInsertions(self, s: str) -> int:
        k = s[::-1]
        #max longest string
        n = len(s)
        dp = [[0]*n for _ in range(n)]
        for i in range(n):
            for j in range(n):
                if not i and not j:
                    dp[i][j] = [0,1][s[i] == k[j]]

                elif not i:
                    dp[i][j] = [0,1][s[i] == k[j]]
                    dp[i][j] = max(dp[i][j],dp[i][j-1])

                elif not j:
                    dp[i][j] = [0,1][s[i] == k[j]]
                    dp[i][j] = max(dp[i][j],dp[i-1][j])

                else:
                    if s[i] == k[j]:
                        dp[i][j] = dp[i-1][j-1] + 1
                    
                    else:
                        dp[i][j] = max(dp[i][j-1],dp[i-1][j])
                



        return n - dp[n-1][n-1]


        