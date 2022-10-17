class Solution:
    def countSubstrings(self, s: str) -> int:
        n = len(s)
        cnt = n
        dp = [[False]*n for _ in range(n)]
        for d in range(1,n):
            for i in range(0,n-d):
                j = i+d
                if s[i] == s[j]:
                    if j-i > 2 and dp[i+1][j-1] == False:
                        continue
                    cnt += 1
                    dp[i][j] = True                  
        return cnt
                    
                    
            
            
            
        