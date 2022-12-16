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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode();
        ListNode ans = dummy;
        ListNode cur1 = list1;
        ListNode cur2 = list2;
        while(cur1!=null && cur2!=null){
            if(cur1.val < cur2.val){
                dummy.next = cur1;
                cur1 = cur1.next;
                dummy = dummy.next;
            }else{
                dummy.next = cur2;
                cur2 = cur2.next;
                dummy = dummy.next;
            }
        }
        while(cur1!=null){
            dummy.next = cur1;
            cur1 = cur1.next;
            dummy = dummy.next;
        }
        while(cur2!=null){
            dummy.next = cur2;
            cur2 = cur2.next;
            dummy = dummy.next;
        }
        return ans.next;
    }
}