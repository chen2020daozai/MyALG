package com.zlj.java.alg.LeetCode;

/**
 * @Classname a343
 * @Date 2020/8/5
 * @Created by 陈刀仔
 * @Description TODO
 */

public class a343 {
    public int integerBreak(int n) {
        int out = 0;
        if (n > 3) {
            if (n % 3 <= 1) {
                int b = n / 3 - 1;
                double v = Math.pow(3, b);
                out = (int) (v * (n - 3 * b));
            } else {
                int b = n / 3;
                double v = Math.pow(3, b);
                out = (int) (v * (n % 3));
            }
        } else {
            if (n ==2)out=1;
            else if (n==3)out=2;
        }
        return out;
    }
}
