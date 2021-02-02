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
    public boolean isPalindrome(ListNode head) {
        if(head==null){
            return true;
        }
        ListNode temp=head;
        int counter=0;
        while(temp!=null){
            counter++;
            temp=temp.next;
        }
        if(counter==1){
            return true;
        }
        int middle=counter/2;
        int left=middle-1;
        int right=(counter%2==0)?1:2;
        
        int i=0;     
        temp=head;
        ListNode temp2;
        while(i<left){
            temp=temp.next;
            i++;
        }
        
        temp2=temp;
     
        for(int k=0;k<right;k++){
            temp=temp.next;    //used for right index
        }
        temp2.next=null;
 
        ListNode curr=head;
        ListNode prev=null;
        while(curr!=null){
            ListNode next= curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        
        
        
        
        int j=0;
        

        while(temp!=null){
            System.out.println(prev.val+"\t"+temp.val);
            if(prev.val!=temp.val){
                return false;
            }
            prev=prev.next;
            temp=temp.next;
        }
       return true; 
    }
}