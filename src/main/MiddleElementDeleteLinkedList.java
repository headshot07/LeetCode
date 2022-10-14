package main;

public class MiddleElementDeleteLinkedList {
    public ListNode deleteMiddle(ListNode head) {
        if(head==null || head.next==null) return null;//Removing head as middle element.

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            if(fast == null || fast.next == null) break;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}
