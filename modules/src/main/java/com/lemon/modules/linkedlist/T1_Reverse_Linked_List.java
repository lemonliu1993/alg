package com.lemon.modules.linkedlist;

/**
 * Created by lemoon on 2023/3/29 17:03
 * leetcode 206
 */
public class T1_Reverse_Linked_List {
    public ListNode reverseList(ListNode head) {
        ListNode result = new ListNode(0);
        ListNode node = head;
        while (node != null) {
            ListNode temp = node.next;
            node.next = result.next;
            result.next = node;
            node = temp;
        }

        return result.next;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
