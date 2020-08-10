package com.zlj.java.alg.LeetCode;

/**
 * 给定一个字符串 s，计算具有相同数量0和1的非空(连续)子字符串的数量，并且这些子字符串中的所有0和所有1都是组合在一起的。
 *
 * 最长连续子串判断
 *
 * @Classname a696_02
 * @Date 2020/8/10
 * @Created by 陈刀仔
 * @Description TODO
 */

public class a696_02 {
    public static void main(String[] args) {
        System.out.println(countBinarySubstrings("1100111110110110011111111111110011001011111111100110111111111101"));
    }

    public static int countBinarySubstrings(String s) {
        int last = Integer.MAX_VALUE;
        int out = 0;
        char c;
        int index = 0;
        while (index < s.length()) {
            int count = 0;
            c = s.charAt(index);
            //&&前面的避免溢出，&&表示前面false直接跳出
            while (index < s.length() &&c == s.charAt(index)  ) {
                index++;
                count++;
            }
            //第一个不计
            if (index != count) {
                out += Math.min(last, count);
            }
            last = count;
        }

        return out;
    }
}
