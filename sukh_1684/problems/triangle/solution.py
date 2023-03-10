class Solution:
    def minimumTotal(self, triangle: List[List[int]]) -> int:
        r = len(triangle)
        for i in range(r-2,-1,-1):
            c = len(triangle[i])
            for j in range(c):
                triangle[i][j] += min(triangle[i+1][j],triangle[i+1][j+1])
            
        
        return triangle[0][0]
        