package com.lemon.modules.linkedlist;

import java.util.List;

/**
 * Created by lemoon on 2023/5/30 20:44
 * <p>
 * 1,4,3,2,5,2
 */
public class T6_Partition_List {
    public ListNode partition(ListNode head, int x) {
        if (head == null) {
            return null;
        }

        ListNode smallHead = new ListNode(0);
        ListNode small = smallHead;
        ListNode largerHead = new ListNode(0);
        ListNode larger = largerHead;

        ListNode node = head;
        while (node != null) {
            ListNode temp = node.next;
            if (node.val < x) {
                small.next = node;
                small = small.next;
                small.next = null;
            } else {
                larger.next = node;
                larger = larger.next;
                larger.next = null;
            }
            node = temp;
        }
        small.next = largerHead.next;
        return smallHead.next;
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

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(4);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(2);
        ListNode l5 = new ListNode(5);
        ListNode l6 = new ListNode(2);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l6;
        new T6_Partition_List().partition(l1, 3);
    }
}
