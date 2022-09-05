class Solution(object):
    def mostWordsFound(self, sentences):
        """
        :type sentences: List[str]
        :rtype: int
        """
        
        maximum = 0
        for sentence in sentences:
            wordCount = 1
            for character in sentence:
                if (character == ' '):
                    wordCount +=1
            maximum = max(maximum, wordCount)
            
        return maximum