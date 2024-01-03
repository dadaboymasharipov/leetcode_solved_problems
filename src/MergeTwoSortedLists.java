public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if (list1 == null)
            return list2;
        else if (list2 == null) {
            return list1;
        }

        ListNode result = new ListNode();
        ListNode traverse = result;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                traverse.val = list1.val;
                list1 = list1.next;
            } else {
                traverse.val = list2.val;
                list2 = list2.next;
            }
            traverse.next = new ListNode();
            traverse = traverse.next;
        }

        if (list1 == null) {
            traverse.val = list2.val;
            traverse.next = list2.next;
        }
        else {
            traverse.val = list1.val;
            traverse.next = list1.next;

        }



        return result;
    }
}
