class Solution(object):
    def restoreString(self, s, indices):
        """
        :type s: str
        :type indices: List[int]
        :rtype: str
        """
        res = list(s)
        for index, element in enumerate(indices):
            res[element] = s[index]
        return ''.join(res)
            