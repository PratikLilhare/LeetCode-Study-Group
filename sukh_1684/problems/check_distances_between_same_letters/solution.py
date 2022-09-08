class Solution:
    def checkDistances(self, s: str, distance: List[int]) -> bool:
        for i in range(26):
            asci = i + 97
            if chr(asci) not in s:
                continue
            first = s.index(chr(asci))
            second = s.index(chr(asci),first+1)
            if second - first -1 !=   distance[i]:
                return False
        return True
        