class Solution:
    def maximumRows(self, matrix: List[List[int]], numSelect: int) -> int:
        colOnes =[]
        m = len(matrix)
        n = len(matrix[0])
        for i in range(n):
            temp = []
            for j in range(m):
                if matrix[j][i] == 1:
                    temp.append(j)
            colOnes.append(temp)
        l = [x for x in range(n)]
        res  = list(combinations(l,n-numSelect))
        maxRow = 0
        for i in res:
            ss = set()
            for j in i:
                for x in colOnes[j]:
                    ss.add(x)
            maxRow = max(maxRow, m - len(ss))
        
        return maxRow
                
        