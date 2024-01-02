/**
 * Medium problem
 */
public class RemoveNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode preTarget = head;
        ListNode end = head;
        int count = 0;
        while (end != null) {
            if (end.next == null){
                if (preTarget == head && preTarget.next != end){
                    head = head.next;
                    break;
                }
                preTarget.next = preTarget.next.next;
            }

            if (end.next != null && count >= n){
                preTarget = preTarget.next;
            }
            end = end.next;
            count++;
        }

        return head;
    }

    public static void main(String[] args) {
        System.out.println(new RemoveNthFromEnd().removeNthFromEnd(
                new ListNode(1,
                        new ListNode(2
//                                new ListNode(3,
//                                        new ListNode(4,
//                                                new ListNode(5, null)
//                                                )
//                                        )
//                                )
                        )), 2
        ));
    }
}
