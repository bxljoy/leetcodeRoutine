package com.alex.leetcode.LinkedList;

/**
 * 21. Merge Two Sorted Lists
 */
public class MergeTwoSortedLists {

    //Solution1 Two Pointers
    public ListNode mergeTwoLists1(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);
        ListNode p = dummy, p1 = list1, p2 = list2;

        while (p1 != null && p2 != null) {
            if (p1.val < p2.val) {
                p.next = p1;
                p1 = p1.next;
            } else {
                p.next = p2;
                p2 = p2.next;
            }
            p = p.next;
        }

        if (p1 != null)
            p.next = p1;
        if (p2 != null)
            p.next = p2;

        return dummy.next;
    }

    //Solution2 recursion
    public ListNode mergeTwoLists2(ListNode list1, ListNode list2) {
        if (list1 == null)
            return list2;
        if (list2 == null)
            return list1;

        if (list1.val < list2.val) {
            list1.next = mergeTwoLists2(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoLists2(list2.next, list1);
            return list2;
        }
    }
}
