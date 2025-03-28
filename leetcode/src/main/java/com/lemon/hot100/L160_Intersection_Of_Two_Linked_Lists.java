package com.lemon.hot100;

/**
 * Created by lemoon on 2025/3/28 21:19
 */
public class L160_Intersection_Of_Two_Linked_Lists {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }


    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode result = new ListNode(0);
        int lenA = 0, lenB = 0;
        ListNode nodeA = headA;
        ListNode nodeB = headB;
        while (nodeA != null) {
            lenA++;
            nodeA = nodeA.next;
        }
        while (nodeB != null) {
            lenB++;
            nodeB = nodeB.next;
        }

        int diff = lenA - lenB;
        while (diff > 0) {
            headA = headA.next;
            diff--;
        }
        while (diff < 0) {
            headB = headB.next;
            diff++;
        }

        while (headA != headB) {
            headA = headA.next;
            headB = headB.next;
        }
        return headA;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(9);
        ListNode l3 = new ListNode(1);
        ListNode l4 = new ListNode(2);
        ListNode l5 = new ListNode(4);
        ListNode r1 = new ListNode(3);
        l1.next=l2;
        l2.next=l3;
        l3.next=l4;
        l4.next=l5;
        r1.next = l4;

        System.out.println(new L160_Intersection_Of_Two_Linked_Lists().getIntersectionNode(l1, r1));

    }

}


