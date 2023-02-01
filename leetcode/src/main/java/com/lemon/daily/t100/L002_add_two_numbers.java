package com.lemon.daily.t100;

/**
 * Created by lemoon on 2023/1/27 08:30
 */
public class L002_add_two_numbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode node = result;
        int isOver = 0;
        while (l1 != null || l2 != null || isOver > 0) {
            int val1 = 0;
            int val2 = 0;
            if (l1 != null) {
                val1 = l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                val2 = l2.val;
                l2 = l2.next;
            }
            int sum = val1 + val2 + isOver;
            isOver = sum / 10;
            node.next = new ListNode(sum % 10);
            node = node.next;
        }
        return result.next;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}