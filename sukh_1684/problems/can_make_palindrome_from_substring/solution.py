class Solution:
    def canMakePaliQueries(self, s: str, queries: List[List[int]]) -> List[bool]:
        res = []
        pre = [[True]*26] # true means even # false means odd
        for e in s:
            counter = pre[-1][:]
            counter[ord(e)-97] ^= True
            pre.append(counter)
        
        for start,end,k in queries:
            counter_start = pre[start]
            counter_end = pre[end+1]
            bal = 0
            for i in range(26):
                bal += [0,1][counter_start[i] ^ counter_end[i]]

            res.append(int(bal/2) <=k)


        return res

        