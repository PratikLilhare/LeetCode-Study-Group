/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
          ListNode first=headA;
          ListNode second=headB;

          
          boolean A=true;
          boolean B=true;
          
          while(first!=null && second!=null){
                            if(first==second){
                  return first;
              }
            first=first.next;
            second=second.next;

              if(A && first==null){
                  first=headB;
                  A=false;
              }
              if(B && second==null){
                  second=headA;
                  B=false;
              }
          }
        return null;
    }  
}