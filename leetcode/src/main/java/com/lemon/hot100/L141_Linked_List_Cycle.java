package com.lemon.hot100;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by lemoon on 2025/3/28 21:58
 */
public class L141_Linked_List_Cycle {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public boolean hasCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        while (!set.contains(head) && head != null) {
            set.add(head);
            head = head.next;
        }
        if(head == null){
            return false;
        }
        return true;
    }

}
