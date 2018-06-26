package com.hard;

import com.base.ListNode;

/**
 * @author:fanwenlong
 * @date:2018-06-25 20:04:37
 * @E-mail:alpha18603074401@gmail.com
 * @mobile:186-0307-4401
 * @description:
 * //给出一个链表，每 k 个节点一组进行翻转，并返回翻转后的链表。
 * //k 是一个正整数，它的值小于或等于链表的长度。如果节点总数不是 k 的整数倍，那么将最后剩余节点保持原有顺序。
 * //示例 :
 * //给定这个链表：1->2->3->4->5
 * //当 k = 2 时，应当返回: 2->1->4->3->5
 * //当 k = 3 时，应当返回: 3->2->1->4->5
 * //你的算法只能使用常数的额外空间
 * //你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换
 */
public class RevertListWithK {
    /**
     * 反转链表
     * @param head
     * @param k
     * @return
     */
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode start = new ListNode(-1);
        ListNode end   = new ListNode(-1);

        start.next = head;
        end.next   = head;
        ListNode p = head;

        while (start != null){
            boolean isHead = (start.next == head);
            int count = k;
            while (count-- > 0){
                end.next = p.next;
                p = p.next;
            }
            p = start.next;
            ListNode.printNodeList(head);
            ListNode prev = null;
            if (isHead){
                prev = revert(p,k - 1);
                head = prev;
            }else if (p != null){
                prev = revert(p.next,k - 1);
            }

            while (prev.next != end.next){
                prev = prev.next;
            }
            ListNode.printNodeList(head);
            start.next = prev;
        }
        return head;
    }

    /**
     * 1->2 转化为2->1
     * @param p
     * @param k
     */
    private ListNode revert(ListNode p,int k) {
        ListNode scan = null;
        ListNode s = p;
        while (k-- > 0){
            if (p == null){
                break;
            }
            scan = p.next;
            if (scan == null){
                break;
            }

            p.next = scan.next;
            scan.next = s;
            s = scan;
        }

        return s;
    }

    public static void main(String[] args){
        ListNode list = ListNode.generateARamdonList(10);
        ListNode.printNodeList(list);
        ListNode.printNodeList(new RevertListWithK().reverseKGroup(list,3));
    }
}
