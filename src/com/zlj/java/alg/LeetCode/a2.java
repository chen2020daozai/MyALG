package com.zlj.java.alg.LeetCode;

import org.junit.Test;

/**
 * 两数相加
 *
 * @Classname a2
 * @Date 2020/8/5
 * @Created by 陈刀仔
 * @Description TODO
 */

public class a2 {
    @Test
    public void test() {
        ListNode listNode1 = new ListNode(8);
        ListNode listNode2 = new ListNode(1);
        listNode2.next=listNode1;
        ListNode listNode = addTwoNumbers(new ListNode(0), listNode2);
        System.out.println(listNode.val);
        System.out.println(listNode.next.val);
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode out = new ListNode(0);
        ListNode temp = new ListNode(0);
        int flag = 0;
        int nextVal = 0;

        while (l1 != null && l2 != null) {
            int a = (l1.val + l2.val + nextVal);
            nextVal = 0;
            temp.val = a % 10;
            nextVal = a / 10;
            if (out.next == null) {
                out.next = temp;
            }
            if (l1.next == null && l2.next == null) {
                break;
            }
            if (l1.next != null) {
                temp.next = new ListNode(0);
                temp = temp.next;
                l1 = l1.next;
                flag=1;
            } else if (l2.next != null){
                temp.next = new ListNode(0);
                temp = temp.next;
                l2 = l2.next;
                flag = 2;
            }else break;
        }
        while (flag == 1) {
            int a = l1.val + nextVal;
            nextVal = 0;
            temp.val = a / 10;
            nextVal = a % 10;
            if (l1.next != null) {
                temp.next = new ListNode(0);
                temp = temp.next;
                l1 = l1.next;
            } else break;
        }
        while (flag == 2) {
            int a = l2.val + nextVal;
            nextVal = 0;
            temp.val = a % 10;
            nextVal = a / 10;
            if (l2.next != null) {
                temp.next = new ListNode(0);
                temp = temp.next;
                l2 = l2.next;
            } else break;
        }
        if (nextVal!=0){
            temp.next=new ListNode(nextVal);
        }
        return out.next;
    }
}
