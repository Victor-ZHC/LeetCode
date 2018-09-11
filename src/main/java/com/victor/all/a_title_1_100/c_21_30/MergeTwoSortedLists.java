package com.victor.all.a_title_1_100.c_21_30;

import com.victor.datastructure.ListNode;

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null || l2 == null) {
            return l1 == null ? l2 : l1;
        }
        ListNode head = l1.val < l2.val ? l1 : l2;
        while (true) {
            if (l1.val < l2.val) {
                if (l1.next == null) {
                    l1.next = l2;
                    break;
                }

                while (l1.next != null && l1.next.val < l2.val) {
                    l1 = l1.next;
                }

                ListNode temp = l1.next;
                l1.next = l2;
                l1 = temp;
                if (l1 == null) {
                    break;
                }
            } else {
                if (l2.next == null) {
                    l2.next = l1;
                    break;
                }

                while (l2.next != null && l2.next.val <= l1.val) {
                    l2 = l2.next;
                }

                ListNode temp = l2.next;
                l2.next = l1;
                l2 = temp;
                if (l2 == null) {
                    break;
                }
            }
        }
        return head;
    }
}
