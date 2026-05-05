class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;

        ListNode curr = head;
        int count = 1;
        while (curr.next != null) {
            curr = curr.next;
            count++;
        }
        curr.next = head;

        k = k % count;
        int stepsToNewHead = count - k;

        ListNode newTail = curr;
        while (stepsToNewHead-- > 0) {
            newTail = newTail.next;
        }

        ListNode newHead = newTail.next;
        newTail.next = null;

        return newHead;
    }
}