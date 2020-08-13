package com.zlj.java.alg.LeetCode;

import java.util.Arrays;

/**
 * 字符串相乘
 *
 * @Classname a43
 * @Date 2020/8/13
 * @Created by 陈刀仔
 * @Description TODO
 */

public class a43 {
    public static void main(String[] args) {
        String multiply = multiply("123", "456");
        System.out.println(multiply);
        System.out.println(multiply("9", "9"));
    }

    public static String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }

        int[] c = new int[num1.length() + num2.length()];
        for (int i = num1.length() - 1; i >= 0; i--) {
            for (int j = num2.length() - 1; j >= 0; j--) {
                c[i + j + 1] += (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
            }
        }

        String s = "";
        for (int i = c.length - 1; i > 0; i--) {
            c[i - 1] += c[i] / 10;
            c[i] = c[i] % 10;
            s = c[i] + s;
        }
        s = c[0] + s;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '0') {
                s = s.substring(i);
                break;
            }
        }
        return s;
    }
}
