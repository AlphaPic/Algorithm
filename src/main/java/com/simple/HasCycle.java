package com.simple;

import com.base.ListNode;

/**
 * 判断一个链表是否有环
 */
public class HasCycle {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null){
            return false;
        }else {
            ListNode fast = head.next.next;
            ListNode slow = head.next;
            while (true){
                if (fast == null){
                    return false;
                }else {
                    //将快指针和慢指针的每一个元素都进行比较
                    fast = fast.next;
                    slow = slow.next;
                    if (fast == null){
                        return false;
                    }else {
                        if (fast == slow){
                            return true;
                        }else {
                            fast = fast.next;
                            if (fast == null){
                                return false;
                            }else {
                                if (fast == slow){
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        HasCycle hasCycle = new HasCycle();
        ListNode list1 = ListNode.generateARamdonList(10);
        System.out.println("list1 has cycle? " + hasCycle.hasCycle(list1));
    }
}
