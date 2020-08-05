package com.zlj;

/**
 * @Classname Main2
 * @Date 2020/8/5
 * @Created by 陈刀仔
 * @Description TODO
 */

import java.util.Scanner;

//AC
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            int m = sc.nextInt();
            int count = 0;
            int count2 = 0;
            for (int i = 0; i < m; i++) {
                int a = sc.nextInt();
                if (a % 4 == 0) {
                    count++;
                    continue;
                }
                if (a % 2 == 0) {
                    count2++;
                }
            }
            if (count2 > 0) {
                count2--;
            }
            if ((m - count2) / 2 <= count) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}

