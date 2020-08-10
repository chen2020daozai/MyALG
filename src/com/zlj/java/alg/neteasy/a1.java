package com.zlj.java.alg.neteasy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @Classname a1
 * @Date 2020/8/8
 * @Created by 陈刀仔
 * @Description TODO
 */

public class a1 {
    public static void main(String[] args) {
        Map<Integer,Integer> map=new HashMap<>();
        map.put(1,0);
        long out=0;

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=scanner.nextInt();
            if (map.containsKey(a[i])){
                out+=map.get(a[i]);
            }else {
                int j=a[i];
                int temp=0;
                if (j>3){
                    temp+=j/2;
                }
                else temp+=1;

                map.put(j,temp);
                out+=temp;
            }
        }


        System.out.println(out);
    }
}
