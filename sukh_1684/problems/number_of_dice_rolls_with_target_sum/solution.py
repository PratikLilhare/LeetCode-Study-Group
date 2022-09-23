class Solution:
    def numRollsToTarget(self, n: int, k: int, target: int) -> int:
        memo = {}
        def dice(i,res):
            if (i,res) in memo:
                return memo[(i,res)]
            if i == 0:
                if res == 0:
                    return 1
                else:
                    return 0
            temp = 0
            for _k in range(1,k+1):
                temp += dice(i-1,res-_k)
            memo[(i,res)] = temp
            
            return memo[(i,res)]
            
            
            
            
            
        return dice(n,target) % (10**9 + 7)
        