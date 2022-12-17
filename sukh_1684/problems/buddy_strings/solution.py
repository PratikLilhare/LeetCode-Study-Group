class Solution:
    def buddyStrings(self, s: str, goal: str) -> bool:
        sN = len(s)
        goalN = len(goal)
        if sN != goalN:
            return False
        l = [] 
        for i,j in zip(s,goal):
            if i != j:
                l.append((i,j))

        if len(l) == 0:
            temp = set()
            for i in s:
                temp.add(i)
            return len(temp) != len(s)

        elif len(l) == 2 :
            return l[0] == (l[1][1],l[1][0])

        else :
            return False
        
