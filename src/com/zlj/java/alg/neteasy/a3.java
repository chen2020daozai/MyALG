package com.zlj.java.alg.neteasy;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Classname a2
 * @Date 2020/8/8
 * @Created by 陈刀仔
 * @Description TODO
 */

public class a3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int i = 0; i < T; i++) {
            long out=0;
            long temp=0;
            int n = scanner.nextInt();
            int[] a = new int[n];
            for (int j = 0; j < n; j++) {
                a[j] = scanner.nextInt();
            }
            if (n==1){
                out=a[0];
            }
            Arrays.sort(a);


            System.out.println(out);
        }
    }
}
