package com.zlj.java.alg.LeetCode;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

/**
 * 无重复字符的最长子串
 *
 *
 * @Classname a3
 * @Date 2020/8/5
 * @Created by 陈刀仔
 * @Description TODO
 */

public class a3 {
    public static void main(String[] args) {
        Queue queue = new ArrayDeque();

        String s = "ohvhjdml";
        int i = lengthOfLongestSubstring(s);
        System.out.println(i);
    }

    public static int lengthOfLongestSubstring(String s) {
        int out = 0;

        Queue<Character> queue = new ArrayDeque();
        for (int i = 0; i < s.length(); i++) {
            if (!queue.contains(s.charAt(i))) {
                queue.add(s.charAt(i));
                out = Math.max(out, queue.size());
            } else {
                out = Math.max(out, queue.size());
                while (!(queue.element() == s.charAt(i))) {
                    queue.poll();
                }
                queue.poll();
                queue.add(s.charAt(i));
            }

        }

        return out;

    }
}
