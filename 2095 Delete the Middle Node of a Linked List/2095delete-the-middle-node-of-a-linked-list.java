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
    public ListNode deleteMiddle(ListNode head) {
        ListNode temp= head;
        int count=0;
        while(temp!=null){
            count++;
            temp= temp.next;
        }
        if(count==1){
            head= null;
            return head;
        }
        temp= head;
        ListNode prev= head;
        for(int i=0;i<count/2;i++){
            prev= temp;
            temp= temp.next;
        }
        prev.next= temp.next;
        temp.next= null;

        return head;
    }
}