package com.alex.leetcode.LinkedList;

/**
 * 2. Add Two Numbers
 */
public class AddTwoNumbers {
    //Solution 1 Two Pointers
    public ListNode addTwoNumbers1(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode p = dummy, p1 = l1, p2 = l2;

        int nextPos = 0;
        while (p1 != null || p2 != null) {
            int sum = 0;
            if (p1 != null && p2 != null) {
                sum = p1.val + p2.val + nextPos;
            } else if (p1 != null && p2 == null) {
                sum = p1.val + nextPos;
            } else if (p1 == null && p2 != null) {
                sum = p2.val + nextPos;
            }

            if (sum - 10 >= 0) {
                p.next = new ListNode(sum - 10);
                nextPos = 1;
            } else {
                p.next = new ListNode(sum);
                nextPos = 0;
            }
            if (p1 != null) {
                p1 = p1.next;
            }
            if (p2 != null) {
                p2 = p2.next;
            }

            p = p.next;
        }

        if (nextPos == 1) {
            p.next = new ListNode(nextPos);
        }

        return dummy.next;
    }
}
