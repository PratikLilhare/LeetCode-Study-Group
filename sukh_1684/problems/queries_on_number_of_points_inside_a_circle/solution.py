class Solution:
    def countPoints(self, points: List[List[int]], queries: List[List[int]]) -> List[int]:
        answer = []
        for qx,qy,r in queries:
            count = 0
            for px,py in points:
                if (math.sqrt((qx-px)**2 + (qy - py)**2) <= r):
                    count += 1
            answer.append(count)
        return answer
        