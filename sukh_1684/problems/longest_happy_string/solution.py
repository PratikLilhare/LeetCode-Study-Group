class Solution:
    def longestDiverseString(self, a,b,c, aa='a',bb='b',cc='c'):
        if (b>a):
            return self.longestDiverseString(b,a,c,bb,aa,cc)
        if (c>b):
            return self.longestDiverseString(a,c,b,aa,cc,bb)
        
        if (b == 0):
            return aa * min(2,a)

        if (a -2 >=b):
            return aa*2 + bb+ self.longestDiverseString(a-2,b-1,c,aa,bb,cc)
        else:
            return aa*min(2,a) + self.longestDiverseString(b,a-min(2,a),c,bb,aa,cc)

    
        


        