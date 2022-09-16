class Solution:
    def calculateMinimumHP(self, dungeon: List[List[int]]) -> int:
        r = len(dungeon)
        c = len(dungeon[0]) 

        for i in range(r-1,-1,-1):
            for j in range(c-1,-1,-1):
                if i == r-1 and j == c-1 :
                    temp = dungeon[i][j]
                    dungeon[i][j]  = 0 if temp >=0 else temp
                elif i == r-1:
                    temp =  dungeon[i][j+1] + dungeon[i][j]
                    dungeon[i][j] = 0 if temp >=0 else temp
                elif j == c-1:
                    temp =  dungeon[i+1][j] + dungeon[i][j]
                    dungeon[i][j] = 0 if temp >=0 else temp   
                else : 
                    a = dungeon[i+1][j]
                    b = dungeon[i][j+1]
                    temp = max(a,b) + dungeon[i][j]
                    dungeon[i][j] = 0 if temp >=0 else temp
                       
        res = dungeon[0][0]       
        return [-res + 1,1][res > 0]
    

        