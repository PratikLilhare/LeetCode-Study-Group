/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(n<=0){
            return head;
        }
        int size=0;
        ListNode temp=head;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        temp=head;
        int i=size-n;   //ith item 0,1,2,.......size-1
        if(i<0 || (i==0 && size==1)){
            return null;
        }
        if(i==0){
            return head.next;
        }
        
        int counter=0;
        while(counter<i-1){
            temp=temp.next;
            counter++;
        }
        
        temp.next=temp.next.next;
       
        
        
        

        
        
        
       return head;
    }
}