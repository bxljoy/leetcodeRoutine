package com.alex.leetcode.LinkedList;

public class RemoveDupFromSortedList {
    /**
     * 83. Remove Duplicates from Sorted List (slow fast pointers)
     * @param head
     * @return
     */
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode slow = head, fast = head;

        while (slow != null && slow.next != null) {
            fast = slow.next;
            if (slow.val == fast.val) {
                slow.next = fast.next;
                fast = fast.next;
            } else {
                slow = slow.next;
                fast = fast.next;
            }
        }

        return dummy.next;
    }
}
