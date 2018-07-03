package com.simple;

import com.base.ListNode;

/**
 * @author:fanwenlong
 * @date:2018-07-03 11:42:06
 * @E-mail:alpha18603074401@gmail.com
 * @mobile:186-0307-4401
 * @description:
 * @detail:
 */
public class MergeTwoListToOne {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null || l2 == null){
            return l1 != null ? l1 : l2;
        }

        ListNode head = l1;
        while (l2 != null){
            ListNode tmp = l2;
            l2 = l2.next;

            l1 = head;
            ListNode previous = null;
            while (l1 != null){
                int val1 = l1.val;
                int val2 = tmp.val;
                if (val1 > val2){
                    if (previous == null) {
                        tmp.next = l1;
                        head = tmp;
                        break;
                    }else if (previous.val < val2){
                        tmp.next = l1;
                        previous.next = tmp;
                        break;
                    }
                }else {
                    ListNode next = l1.next;
                    if (next == null) {
                        l1.next = tmp;
                        break;
                    }else if (next.val > val2){
                        tmp.next = next;
                        l1.next = tmp;
                        break;
                    }
                }
                l1 = l1.next;
            }
        }

        return head;
    }

    public static void main(String[] args) {
        ListNode listNode1 = ListNode.generateARamdonList(2);
        ListNode.printNodeList(listNode1);
        ListNode listNode2 = ListNode.generateARamdonList(2);
        ListNode.printNodeList(listNode2);
        ListNode head = new MergeTwoListToOne().mergeTwoLists(listNode1,listNode2);
        ListNode.printNodeList(head);
    }
}
