package com.simple;

import com.base.ListNode;

/**
 * 反转链表
 */
public class RevertList {
    /**
     * 反转链表(常规方式)
     * @param head
     * @return
     */
    public ListNode reverseList1(ListNode head) {
        //没有元素或者只有一个元素的时候返回
        if (head == null || head.next == null){
            return head;
        }else {
            ListNode nHead = null;
            while (head != null){
                ListNode nNext = head.next;
                head.next = nHead;
                nHead = head;
                head = nNext;
            }
            return nHead;
        }
    }

    /**
     * 反转链表(递归)
     * @param head
     * @return
     */
    public ListNode reverseList2(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }else {
            ListNode p = reverseList2(head.next);
            head.next.next = head;
            head.next = null;
            return p;
        }
    }

    public static void main(String[] args) {
        RevertList revertList = new RevertList();
        ListNode before = ListNode.generateARamdonList(10);
        ListNode.printNodeList(before);
        ListNode after = revertList.reverseList2(before);
        ListNode.printNodeList(after);
    }
}
