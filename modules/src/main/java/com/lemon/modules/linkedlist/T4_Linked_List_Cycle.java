package com.lemon.modules.linkedlist;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by lemoon on 2023/5/30 06:43
 */
public class T4_Linked_List_Cycle {

    public boolean hasCycle(ListNode head) {
        Set<ListNode> set = new HashSet<ListNode>();
        ListNode node = head;
        while (node != null) {
            if (set.contains(node)) {
                return true;
            }
            set.add(node);
            node = node.next;
        }
        return false;
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
