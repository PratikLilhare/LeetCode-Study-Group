class Solution:
    def longestPalindrome(self, s: str) -> int:
        temp = set()
        res = 0
        for i in s:
            if i not in temp:
                temp.add(i)
            else:
                res += 2
                temp.remove(i)

        return [res+1,res][res == len(s)]
