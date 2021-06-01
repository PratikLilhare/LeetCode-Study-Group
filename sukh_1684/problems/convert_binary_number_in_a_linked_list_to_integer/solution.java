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
    public int getDecimalValue(ListNode head) {
        ListNode temp = head;
        int index = 0;
        while(temp!=null){
            index++;
            temp=temp.next;
        }
        index = index-1;
        int num = 0;
        while(head!=null){
            if(head.val == 1){
                num = num + (int)Math.pow(2,index);

            }
            head = head.next;
            index--;
        }
        
        return num;
    }
}