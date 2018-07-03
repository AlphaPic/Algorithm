package com.simple;

import com.base.ListNode;

/**
 * @author:fanwenlong
 * @date:2018-07-03 20:25:40
 * @E-mail:alpha18603074401@gmail.com
 * @mobile:186-0307-4401
 * @description:
 * @detail:
 */
public class GetTheStartNodeOfTwoList {

    /**
     * 获取两个链表的交点
     * @param headA
     * @param headB
     * @return
     */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null){
            return null;
        }

        int lenA = getLengthOfList(headA);
        int lenB = getLengthOfList(headB);

        int len = lenA > lenB ? lenA - lenB : lenB - lenA;
        ListNode first  = lenA > lenB ? headA : headB;
        ListNode second = lenA > lenB ? headB : headA;
        while (len-- > 0){
            first = first.next;
        }

        while (first != null && second != null){
            if (first == second){
                return first;
            }
            first = first.next;
            second = second.next;
        }
        return null;
    }

    private int getLengthOfList(ListNode node){
        if (node == null){
            return 0;
        }
        ListNode scan = node;
        int len = 0;
        while (scan != null){
            len++;
            scan = scan.next;
        }
        return len;
    }

    public static void main(String[] args) {
        ListNode list1 = ListNode.generateARamdonList(4);
        ListNode list2 = ListNode.generateARamdonList(8);
        GetTheStartNodeOfTwoList demo = new GetTheStartNodeOfTwoList();
        ListNode node = demo.getIntersectionNode(list1,list2);
        if (node == null){
            System.out.println("链表无交点");
        }

        ListNode tail = list1;
        while (tail.next != null){
            tail = tail.next;
        }
        tail.next = list2.next.next.next;
        ListNode node1 = demo.getIntersectionNode(list1,list2);
        if (node1 != null){
            System.out.println("链表的交点为" + node1.val);
        }
    }
}
