package com.zlj.java.alg;

import java.util.ArrayList;

/**
 * @Classname a202
 * @Date 2020/8/5
 * @Created by 陈刀仔
 * @Description TODO
 */

public class a202 {
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
        ListNode node = new ListNode(0);
        ArrayList list = new ArrayList();
        ArrayList list2 = new ArrayList();

        while (l1 != null) {
            list.add(l1.val);
            l1 = l1.next;
        }
        while (l2 != null) {
            list2.add(l2.val);
            l2 = l2.next;
        }
        int max;
        int min;
        if (list.size() == list2.size()) {
            min = max = list.size();
        } else {
            max = (list.size() > list2.size()) ? list.size() : list2.size();
            min = (list.size() < list2.size()) ? list.size() : list2.size();
        }
        int[] out = new int[max + 1];
        for (int i = 0; i < min; i++) {
            out[i] = (int) list.get(i) + (int) list2.get(i);
        }
        if (max != min) {
            if (list.size() == max) {
                for (int i = min; i < max; i++) {
                    out[i] = (int) list.get(i);
                }
            } else {
                for (int i = min; i < max; i++) {
                    out[i] = (int) list2.get(i);
                }
            }
        }
        ListNode temp=new ListNode(0);
        for (int i = 0; i < max; i++) {
            if (out[i] % 10 >= 0) {
                out[i + 1] += out[i] / 10;
                out[i]=out[i]%10;
            }
            temp.val=out[i];
            if (node.next==null){
                node.next=temp;
            }
            if (i==max-1){

            }else {
                temp.next=new ListNode(0);
                temp=temp.next;
            }
        }
        if (out[max]!=0){
            temp.next=new ListNode(out[max]);
        }
        return node.next;
    }
}
