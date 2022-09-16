class Solution:
    def minPathSum(self, grid: List[List[int]]) -> int:
        '''
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
        m = len(grid) #row
        n = len(grid[0])
        for i in range(m-1,-1,-1):
            for j in range (n-1,-1,-1):
                if i == m-1 and j == n-1:
                    pass
                elif i == m-1:
                    grid[i][j] += grid[i][j+1]
                elif j == n-1:
                    grid[i][j] += grid[i+1][j]
                else:
                    grid[i][j] += min(grid[i+1][j],grid[i][j+1])
        
        
        
        return grid[0][0]

        