package com.victor.all.a_title_1_100.c_21_30;

import com.victor.datastructure.ListNode;

public class MergeKSortedLists {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length == 0) return null;
        return binaryMerge(lists, 0, lists.length - 1);
    }

    private ListNode binaryMerge(ListNode[] lists, int l, int r) {
        if(l == r) return lists[l];
        int mid = (l + r) / 2;
        ListNode left = binaryMerge(lists, l, mid);
        ListNode right = binaryMerge(lists, mid + 1, r);
        return merge(left, right);
    }

    private ListNode merge(ListNode l1, ListNode l2) {
        if(l1 == null) return l2;
        if(l2 == null) return l1;

        if(l1.val < l2.val) {
            l1.next = merge(l1.next, l2);
            return l1;
        } else {
            l2.next = merge(l1, l2.next);
            return l2;
        }
    }

}
