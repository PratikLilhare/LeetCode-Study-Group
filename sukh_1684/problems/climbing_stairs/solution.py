class Solution:
    def climbStairs(self, n: int) -> int:
        dp = [1,1] + [None]* (n-1)
        
        def steps(i):
            if dp[i] != None:
                return dp[i]
            dp[i] = steps(i-1) + steps(i-2)
            return dp[i]
            
        
        
        return steps(n)
        
        '''
        dp = [1,1]
        for i in range(2,n+1):
            dp.append(dp[i-1] + dp[i-2])
        return dp[n]
        '''
            
        