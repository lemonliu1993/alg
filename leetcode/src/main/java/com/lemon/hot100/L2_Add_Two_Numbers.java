package com.lemon.hot100;

import java.util.List;

/**
 * Created by lemoon on 2025/3/28 22:35
 */
public class L2_Add_Two_Numbers {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int isOver = 0;
        ListNode result = new ListNode(0);
        ListNode node = result;
        while (l1 != null || l2 != null || isOver == 1) {
            int n1 = 0;
            int n2 = 0;
            if (l1 != null) {
                n1 = l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                n2 = l2.val;
                l2 = l2.next;
            }
            int total = n1 + n2 + isOver;
            node.next = new ListNode(total % 10);
            node = node.next;
            isOver = total / 10;
        }
        return result.next;
    }
}
