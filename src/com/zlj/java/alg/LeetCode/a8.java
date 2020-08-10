package com.zlj.java.alg.LeetCode;

/**
 * @Classname a8
 * @Date 2020/8/7
 * @Created by 陈刀仔
 * @Description TODO
 */

public class a8 {
    public static void main(String[] args) {
//        System.out.println(myAtoi("+01a55"));

//        System.out.println(Long.parseLong("-1"));
//        System.out.println(myAtoi("-01a55"));
//        System.out.println(myAtoi("+1a55"));
//        System.out.println(myAtoi("+a55"));
//        System.out.println(myAtoi("20000000000000000000"));
//        System.out.println(myAtoi("-91283472332"));
        System.out.println(myAtoi("    0000000000000   "));
    }

    public static int myAtoi(String str) {
        str = str.trim();
        int out = 0;
        if (str.length() == 0 || str == null) return 0;
            //正负号开头
        else if (str.charAt(0) == '+' || str.charAt(0) == '-') {
            if (str.length() == 1) return 0;
                //正负号之后是0到9
            else if (str.charAt(1) - '0' <= 9 && str.charAt(1) - '0' >= 0) {
                //0开头，去掉0，防止转换异常
                if (str.charAt(1) == '0') {
                    String temp = "";
                    if (str.charAt(0) == '-') temp = "-";
                    for (int i = 1; i < str.length(); i++) {
                        //0之后是数字
                        if (str.charAt(i) - '0' <= 9 && str.charAt(i) - '0' > 0) {
                            str = temp + str.substring(i);
                            break;
                        }
                        //0之后不是数字
                        else if (!(str.charAt(i) - '0' <= 9 && str.charAt(i) - '0' >= 0)) {
                            return 0;
                        }
                    }
                }
            } else return 0;//正负号之后不是数字
        }
        //数字开头
        else if (str.charAt(0) - '0' <= 9 && str.charAt(0) - '0' >= 0) {
            //开头是0，去掉0，防止转换异常
            if (str.charAt(0) == '0') {
                for (int i = 0; i < str.length(); i++) {
                    if ((str.charAt(i) - '0' <= 9 && str.charAt(i) - '0' > 0)) {
                        str = str.substring(i);
                        break;
                    }
                    //0之后不是数字
                    else if (!(str.charAt(i) - '0' <= 9 && str.charAt(i) - '0' >= 0)) {
                        return 0;
                    }
                    if (i==str.length()-1&&str.charAt(i)=='0')return 0;
                }
            }
        }

        //字符串，数字后面是字符
        if (str.length() == 0 || str == null) return 0;
        else {
            //开头不是   数字或者正负号
            if (!((str.charAt(0) - '0' <= 9 && str.charAt(0) - '0' >= 0) || (str.charAt(0) == '+') || (str.charAt(0) == '-'))) {
                return 0;
            } else {
                for (int i = 1; i < str.length(); i++) {
                    if (!(str.charAt(i) - '0' <= 9 && str.charAt(i) - '0' >= 0)) {
                        str = str.substring(0, i);
                        break;
                    }
                }
            }
        }

        if (str.length() > 11) {
            if (str.charAt(0)=='+')out = Integer.MAX_VALUE;
            else if (str.charAt(0)=='-')out=Integer.MIN_VALUE;
            else out = Integer.MAX_VALUE;
        }
        else {
            //转换
            long l = 0;
            l = Long.parseLong(str);
            if (l > Integer.MAX_VALUE) out = Integer.MAX_VALUE;
            else if (l < Integer.MIN_VALUE) out = Integer.MIN_VALUE;
            else out = (int) l;
            return out;
        }
        return out;
    }
}
