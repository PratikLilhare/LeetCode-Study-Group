# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNodes(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if not head: return None
        head.next = self.removeNodes(head.next)
        if head.next and head.val < head.next.val:
            return head.next
        return head
        
        
    def recurr(self,head):
        if (head.next == None):
            return [head,head.val]
        res = self.recurr(head.next)
        if res[1] > head.val:
            head.val = head.next.val
            head.next = head.next.next
         
        return [head,head.val]
            
        