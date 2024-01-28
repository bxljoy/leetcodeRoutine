package com.alex.leetcode.LinkedList;

/**
 * 203. Remove Linked List Elements
 *
 */
public class RemoveLinkedListElements {

    //Solution 1 dummy head node and pointer
    public ListNode removeElements1(ListNode head, int val) {
        ListNode dummy = new ListNode(-1);
        ListNode p = dummy, p1 = head;

        while (p1 != null) {
            if (p1.val == val) {
                p1 = p1.next;
                p.next = null;
            } else {
                p.next = p1;
                p1 = p1.next;
                p = p.next;
            }
        }

        return dummy.next;
    }

    //Solution 2 recursion
    public ListNode removeElements2(ListNode head, int val) {
        if (head == null) return null;

        ListNode next = removeElements2(head.next, val);

        if (head.val == val) {
            return next;
        } else {
            head.next = next;
            return head;
        }
    }
}
