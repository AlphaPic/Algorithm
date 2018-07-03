package com.base;

/**
 * @author:fanwenlong
 * @date:2018-06-25 20:04:01
 * @E-mail:alpha18603074401@gmail.com
 * @mobile:186-0307-4401
 * @description:
 * @detail:
 */
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int val) {
        this.val = val;
    }

    /**
     * 生成一个具有上限的node链表
     * @param limit
     * @return
     */
    public static ListNode generateARamdonList(int limit){
        if(limit <= 0){
            return null;
        }
        ListNode head = new ListNode(1);
        ListNode tail = head;
        for(int i = 2;i <= limit;i++){
            ListNode node = new ListNode(i);
            tail.next = node;
            tail = tail.next;
        }

        return head;
    }

    /**
     * 打印链表
     * @param head
     */
    public static void printNodeList(ListNode head){
        if (head == null){
            return;
        }

        ListNode p = head;
        StringBuilder sb = new StringBuilder(1000);
        while (p.next != null){
            sb.append(p.val).append("->");
            p = p.next;
        }

        sb.append(p.val);

        System.out.println(sb.toString());
    }
}
