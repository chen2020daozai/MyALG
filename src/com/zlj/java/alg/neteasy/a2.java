package com.zlj.java.alg.neteasy;

import java.util.Scanner;

/**
 * @Classname a2
 * @Date 2020/8/8
 * @Created by 陈刀仔
 * @Description TODO
 */

public class a2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] a = new int[n];
        int[] temp = new int[m];
        int all = n - m;

        for (int i = 0; i < m; i++) {
            temp[i] = scanner.nextInt();
        }
        
    }
}
