package com.victor.all.a_title_1_100.b_11_20;

import java.util.HashMap;

public class RemoveNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        HashMap<Integer, ListNode> map = new HashMap();
        ListNode p = head;

        int total = 0;

        while (p != null) {
            map.put(total, p);
            p = p.next;
            total++;
        }

        ListNode front = map.get(total - n - 1);
        ListNode back = map.get(total - n + 1);

        if (front == null) {
            return back;
        } else {
            front.next = back;
            return head;
        }
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
