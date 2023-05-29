package com.lemon.modules.linkedlist;

/**
 * Created by lemoon on 2023/5/30 06:25
 */
public class T3_Intersection_Of_Two_Linked_Lists {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = 0;
        int lenB = 0;
        ListNode nodeA = headA;
        ListNode nodeB = headB;

        lenA = getListLen(nodeA);
        lenB = getListLen(nodeB);
        boolean alonger = true;
        int diff = 0;
        if (lenA > lenB) {
            diff = lenA - lenB;
        } else {
            diff = lenB - lenA;
            alonger = false;
        }

        if (alonger) {
            while (diff > 0) {
                nodeA = nodeA.next;
                diff--;
            }
        } else {
            while (diff > 0) {
                nodeB = nodeB.next;
                diff--;
            }
        }
        while (nodeA != null && nodeB != null && nodeA != nodeB) {
            nodeA = nodeA.next;
            nodeB = nodeB.next;
        }
        return nodeA;

    }

    public int getListLen(ListNode listNode) {
        int result = 0;
        while (listNode != null) {
            result++;
            listNode = listNode.next;
        }
        return result;
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
