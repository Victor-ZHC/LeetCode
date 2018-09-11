package com.victor.all.a_title_1_100.c_21_30;

import com.victor.datastructure.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class MergeKSortedListsTest {

    @Test
    public void mergeKLists() {
        MergeKSortedLists mergeKSortedLists = new MergeKSortedLists();
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(5);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        ListNode l3 = new ListNode(2);
        l3.next = new ListNode(6);

        ListNode[] lists = new ListNode[]{l1, l2, l3};

        ListNode head = mergeKSortedLists.mergeKLists(lists);
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
}