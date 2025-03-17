package com.lemon.modules.recursive;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lemoon on 2025/3/16 11:38
 */
public class Add_To_Vector {

    public static void addToVector(ListNode head, List<ListNode> result){
        if(head == null){
            return ;
        }
        result.add(head);
        addToVector(head.next,result);
    }


    static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node1.next= node2;
        node2.next= node3;
        node3.next= node4;
        node4.next= node5;
        List<ListNode> res = new ArrayList<>();
        addToVector(node1,res);
        for(ListNode node : res){
            System.out.println(node.val);
        }

    }
}
