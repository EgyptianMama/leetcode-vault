/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode f= head;
        ListNode s= head;
        int check = -1;
        while(f!=null && f.next!=null){
            f= f.next.next;
            s= s.next;
            if(f==s){
                check=1;
                break;
            }
        }

        if(check==-1){
            return null;
        }

        if(check==1){
            s=head;
            while(f!=s){
                f=f.next;
                s=s.next;
            }
        }

        return f;
    }
}