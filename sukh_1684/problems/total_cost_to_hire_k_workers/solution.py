from queue import PriorityQueue
class Solution:
    def totalCost(self, costs: List[int], k: int, candidates: int) -> int:
        queue1 = PriorityQueue()
        queue2 = PriorityQueue()
        pointer1 = 0
        pointer2 = len(costs) -1
        while (pointer1 <= pointer2 and pointer1 < candidates):
            queue1.put(costs[pointer1])
            pointer1 += 1
            if pointer2 >= pointer1:
                queue2.put(costs[pointer2])
                pointer2 -= 1
        total = 0
        for i in range(k):
            
            if queue1.empty():
                total += queue2.get()

            elif queue2.empty():
                total+= queue1.get()

            elif queue1.queue[0] <= queue2.queue[0]:
                total += queue1.get()
                if pointer1 <= pointer2:
                    queue1.put(costs[pointer1])
                    pointer1 += 1
            elif queue2.queue[0] <= queue1.queue[0]:
                total += queue2.get()
                if pointer2 >= pointer1:
                    queue2.put(costs[pointer2])
                    pointer2 -= 1

                
        
        return total
            
            
    
        