import annotations.Unsolved;

import static annotations.enums.Status.MEDIUM;

public class AddTwoNumbers {

    /*
    2. Add Two Numbers
    ----------------
    time: 1ms
    rating: 100%
    */

    @Unsolved(MEDIUM)
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int val = 0;
        int r = 0;
        ListNode result = new ListNode();
        ListNode temp = result;

        while (l1 != null && l2 != null) {
            val = l1.val + l2.val + r;
            r = 0;
            if (val >= 10) {
                val -= 10;
                r = 1;
            }
            ListNode listNode = new ListNode(val);
            temp.next = listNode;
            temp = temp.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        ListNode nodeContinuation;
        if (l1 != null)
            nodeContinuation = l1;
        else
            nodeContinuation = l2;
        if (nodeContinuation != null) {
            while (nodeContinuation != null) {
                val = nodeContinuation.val + r;
                r = 0;
                if (val >= 10) {
                    val -= 10;
                    r = 1;
                }
                ListNode listNode = new ListNode(val);
                temp.next = listNode;
                temp = temp.next;
                nodeContinuation = nodeContinuation.next;
            }
        }
        if (r == 1) {
            ListNode listNode = new ListNode(r);
            temp.next = listNode;
        }
        return result.next;
    }
}
