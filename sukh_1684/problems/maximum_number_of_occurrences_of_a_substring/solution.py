class Solution:
    def maxFreq(self, s: str, maxLetters: int, minSize: int, maxSize: int) -> int:
        d = defaultdict(int)
        maxLen  = 0
        for i in range(0,len(s)-minSize + 1):
            temp = s[i:i+minSize]
            set_temp = set(temp)
            if len(set_temp) > maxLetters:
                continue
            d[temp] += 1
            maxLen = max(maxLen,d[temp])
        print(d)
        return maxLen



