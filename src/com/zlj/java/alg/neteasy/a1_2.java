package com.zlj.java.alg.neteasy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @Classname a1_2
 * @Date 2020/8/8
 * @Created by 陈刀仔
 * @Description TODO
 */

public class a1_2 {
    public static void main(String[] args) {

        long out = 0;

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a;
        for (int i = 0; i < n; i++) {
            a = scanner.nextInt();

            int temp = 0;
            if (a > 3) {
                temp += a / 2;
            } else if (a > 1 && a <= 3) {
                temp += 1;
            }

            out += temp;
        }


        System.out.println(out);
    }
}
