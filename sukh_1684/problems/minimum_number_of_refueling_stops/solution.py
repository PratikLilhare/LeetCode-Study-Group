from queue import PriorityQueue
class Solution:
    def minRefuelStops(self, target: int, startFuel: int, stations: List[List[int]]) -> int:
        queue = PriorityQueue()
        n = len(stations)
        count = 0
        curr = startFuel
        for i in range(n):
            if curr < stations[i][0]:
                while(curr < stations[i][0]):
                    if (queue.empty()):
                        return -1
                    count += 1
                    item = queue.get()[1]
                    curr += item
            fuel = stations[i][1]
            queue.put((-fuel,fuel))

            
        while(curr < target):
            if (queue.empty()):
                return -1
            count += 1
            item = queue.get()[1]
            curr += item

        
        else:
            return count