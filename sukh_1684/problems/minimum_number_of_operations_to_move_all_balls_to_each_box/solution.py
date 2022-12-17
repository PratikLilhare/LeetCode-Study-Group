class Solution:
    def minOperations(self, boxes: str) -> List[int]:

        balls_right = 0
        balls_sum = 0
        ans = []
        for index,i in enumerate(boxes [1:]):
            index += 1
            if i == '1':
                balls_right += 1
                balls_sum += index
        ans.append(balls_sum)
        
        balls_left = 1 if boxes[0] == '1' else 0
        
        for index, i in enumerate(boxes [1:]):
            index += 1
            ans.append(ans[index-1]  - balls_right + balls_left)
            if i == '1':
                balls_right -= 1
                balls_left += 1
                
        return ans
        
        