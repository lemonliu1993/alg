package com.lemon.modules.linkedlist;

import java.util.List;

/**
 * Created by lemoon on 2023/5/29 22:33
 * <p>
 * 1，2，3，4，5
 * 2，4
 * 1,4,3,2,5
 */
public class T2_Reverse_Linked_List_II {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null) {
            return null;
        }
        ListNode result = new ListNode(0);
        result.next = head;
        int len = right - left + 1;
        ListNode node = result;
        ListNode preTail = null;
        ListNode newHead = new ListNode(0);
        ListNode newTail = null;
        ListNode newNext = null;
        while (left > 1) {
            node = node.next;
            left--;
        }

        preTail = node;
        newTail = node.next;
        node = node.next;
        for (int i = 0; i < len; i++) {
            ListNode temp = node.next;
            node.next = newHead.next;
            newHead.next = node;
            node = temp;
        }
        newNext = node;
        preTail.next = newHead.next;
        newTail.next = newNext;
        return result.next;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int x) {
            val = x;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
