package com.victor.all.a_title_1_100.c_21_30;

import com.victor.datastructure.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class MergeTwoSortedListsTest {

    @Test
    public void mergeTwoLists() {
        MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        ListNode head = mergeTwoSortedLists.mergeTwoLists(l1, l2);
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
}