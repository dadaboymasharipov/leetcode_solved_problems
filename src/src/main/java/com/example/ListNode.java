package com.example;

import java.util.List;

public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public ListNode add(List<Integer> list) {
        ListNode result = new ListNode();
        ListNode temp = result;
        for (Integer i : list) {
            temp.next = new ListNode(i);
            temp = temp.next;
        }
        return result.next;
    }

}
