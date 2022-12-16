class Solution:
    def letterCombinations(self, digits: str) -> List[str]:
        # If the input is empty, immediately return an empty answer array
        if len(digits) == 0: 
            return []
        
        # Map all the digits to their corresponding letters
        letters = {"2": "abc", "3": "def", "4": "ghi", "5": "jkl", 
                   "6": "mno", "7": "pqrs", "8": "tuv", "9": "wxyz"}
        res = []
        def backtrack(index, path):
            # If the path is the same length as digits, we have a complete combination
            if len(digits) == len(path):
                res.append(path)
                return 
            chars = letters[digits[index]]
            for c in chars:
                backtrack(index+1, path+c)
        if digits:
            backtrack(0,"")
            return res