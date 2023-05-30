package com.lemon.modules.linkedlist;

import java.util.List;

/**
 * Created by lemoon on 2023/5/30 06:50
 */
public class T5_Linked_List_Cycle_II {

    public ListNode detectCycle(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode fast = head;
        ListNode slow = head;
        ListNode meet = null;
        while (fast != null) {

            slow = slow.next;
            fast = fast.next;
            if (fast == null) {
                return null;
            }
            fast = fast.next;
            if (fast == slow) {
                meet = fast;
                break;
            }
        }
        if (meet == null) {
            return null;
        }

        ListNode node = head;
        while (node != meet) {
            node = node.next;
            meet = meet.next;
        }
        return meet;
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
