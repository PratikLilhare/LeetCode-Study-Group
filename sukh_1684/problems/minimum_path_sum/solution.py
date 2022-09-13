class Solution:
    def minPathSum(self, grid: List[List[int]]) -> int:
        m = len(grid)
        n = len(grid[0])
        for i in range(m):
            for j in range(n):
                if not i and not j:
                    pass
                elif not i:
                    grid[i][j] += grid[i][j-1]
                elif not j:
                    grid[i][j] += grid[i-1][j]
                else :
                    grid[i][j]  += min(grid[i-1][j], grid[i][j-1])
                    
        return grid[m-1][n-1]
        '''
        m = len(grid)
        n = len(grid[0])
        hR = m - 1
        hC = n -1
        dp = [[None]* n for _ in range(m)]
        
        dp[hR][hC]  = grid[hR][hC]
        def minSum(i,j):
            if(dp[i][j] != None):
                pass
            elif (i == hR):
                dp[i][j] = minSum(i,j+1) + grid[i][j]
            elif (j == hC) :
                dp[i][j] = minSum(i+1,j) + grid[i][j]
            else :
                dp[i][j] = min(minSum(i+1,j), minSum(i,j+1)) + grid[i][j]
            return dp[i][j]
        
        res = minSum(0,0)
        return res
        ''' 
        '''
        m = len(grid) #row
        n = len(grid[0])
        dp = [[-1] * n]*m
        lr = m -1
        lc = n -1
        for i in range(lr,-1,-1):
            for j in range (lc,-1,-1):
                if (i+1 > lr and j+1 > lc):
                    dp[i][j] = grid[i][j]
                elif (i+1> lr):
                    dp[i][j] = dp[i][j+1] + grid[i][j]
                elif (j+1 > lc):
                    dp[i][j] = dp[i+1][j] + grid[i][j]
                else:
                    dp[i][j] = min(dp[i+1][j],dp[i][j+1]) + grid[i][j]
        
        
        
        return dp[0][0]
        '''
        