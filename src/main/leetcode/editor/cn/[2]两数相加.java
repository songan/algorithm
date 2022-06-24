//leetcode submit region begin(Prohibit modification and deletion)
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null || l2 == null) {
            return l1 == null ? l2 : l1;
        }

        ListNode head = null;
        ListNode next = null;

        int c = 0;
        while (l1 != null || l2 != null) {
            int l1v = l1 != null ? l1.val : 0;
            int l2v = l2 != null ? l2.val : 0;

            int sum = l1v + l2v + c;
            if (head == null) {
                head = new ListNode(sum % 10);
                next = head;
            } else {
                ListNode node = new ListNode(sum % 10);
                next.next = node;
                next = node;
            }

            c  = sum / 10;
            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;

        }
        if (c != 0) {
            next.next = new ListNode(c);
        }
        return head;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
