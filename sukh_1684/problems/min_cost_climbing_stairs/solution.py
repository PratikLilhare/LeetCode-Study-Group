class Solution:
    def minCostClimbingStairs(self, cost: List[int]) -> int:
        '''dp = {}
        l = len(cost)
        
        
        def climb(index):
            if(index >= l):
                return 0
            if (index in dp):
                return dp[index]
            dp[index] = min(climb(index+1), climb(index+2)) + (cost[index] if index >= 0 else 0 )
            return dp[index]
        
        return climb(-1)
        '''
        dp = {}
        n = len(cost)
        dp[n], dp[n+1] = 0, 0
        for i in range(n-1,-1,-1):
            dp[i] = min(dp[i+2],dp[i+1]) + cost[i]
        return min(dp[0],dp[1])
            
    
        