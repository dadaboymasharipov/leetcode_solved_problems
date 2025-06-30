package com.example;

/**
 * Medium problem
 */
public class RemoveNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode preTarget = head;
        ListNode end = head;

        for (int i = 0; i < n; i++){
            end = end.next;
        }
        if (end == null)
            return head.next;

        while (end.next != null){
            preTarget = preTarget.next;
            end = end.next;
        }

        preTarget.next = preTarget.next.next;

        return head;
    }
}
