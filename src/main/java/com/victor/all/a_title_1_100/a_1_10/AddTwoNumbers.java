package com.victor.all.a_title_1_100.a_1_10;

/**
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
 */
public class AddTwoNumbers {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode root = new ListNode(0);
        ListNode each = root;
        int add = 0;
        while (l1 != null && l2 != null) {
            int sum = l1.val + l2.val + add;
            each.next = new ListNode(sum % 10);
            each = each.next;
            add = sum / 10;
            l1 = l1.next;
            l2 = l2.next;
        }

        while (l1 != null) {
            int sum = l1.val + add;
            each.next = new ListNode(sum % 10);
            each = each.next;
            add = sum / 10;
            l1 = l1.next;
        }

        while (l2 != null) {
            int sum = l2.val + add;
            each.next = new ListNode(sum % 10);
            each = each.next;
            add = sum / 10;
            l2 = l2.next;
        }

        if (add > 0) {
            each.next = new ListNode(add);
        }

        return root.next;
    }

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}



