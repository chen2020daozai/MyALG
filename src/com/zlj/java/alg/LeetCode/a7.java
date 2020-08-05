package com.zlj.java.alg.LeetCode;

/**
 * 整数翻转
 * @Classname a7
 * @Date 2020/8/5
 * @Created by 陈刀仔
 * @Description TODO
 */

public class a7 {
    public static void main(String[] args) {
        String a= "9646324351";
        System.out.println(new StringBuilder(a).reverse());
    }

    public int reverse(int x){
        boolean flag=true;
        if (x<0){
            flag=false;
            x=0-x;
        }
        String s = Integer.toString(x);
        StringBuilder out=new StringBuilder(s);
        out=out.reverse();
        String o=new String(out);
        try {
            x=Integer.parseInt(o);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return 0;
        }
        if (!flag)x=0-x;
        return x;
    }
}
