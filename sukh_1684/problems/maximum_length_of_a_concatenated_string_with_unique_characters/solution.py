class Solution:
    def maxLength(self, arr: List[str]) -> int:
        dp = [set()]
        for e in arr:
            temp = set(e)
            if len(e) != len(temp): continue
            for k in dp[:]:
                if temp & k : continue
                dp.append(temp|k)

            
        return max([len(i) for i in dp])
        