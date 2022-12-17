class Solution:
    def frequencySort(self, s: str) -> str:
        n = len(s)
        d = {}
        for e in s:
            if e in d:
                d[e] += 1
            else:
                d[e] = 1

        l = [[] for _ in range(n)]
        for key in d:
            l[d[key]-1].append(key)

        res = ""

        for i in range(len(l)-1,-1,-1):
            temp = l[i]
            if not temp:
                pass
            for j in temp:
                for k in range(i+1):
                    res = res+j


        return res

        

        