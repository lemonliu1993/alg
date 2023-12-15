package com.lemon.sword;

/**
 * Created by lemoon on 2023/5/20 06:23
 */
public class S18 {
    public ListNode deleteNode(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        ListNode result = new ListNode(val + 1);
        result.next = head;
        head = result;
        while (head.next != null) {
            if (head.next.val == val) {
                head.next = head.next.next;
                break;
            }else{
                head = head.next;
            }
        }
        return result.next;
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
