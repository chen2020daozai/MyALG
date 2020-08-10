package com.zlj.java.alg.LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * 复原ip地址
 *
 * @Classname a93
 * @Date 2020/8/9
 * @Created by 陈刀仔
 * @Description TODO
 */

public class a93 {
    public static void main(String[] args) {

    }

    /*

    */
    public List<String> restoreIpAddresses(String s) {
        List<String> ret = new ArrayList<>();

        StringBuilder ip = new StringBuilder();

        for (int a = 1; a < 4; ++a)
            for (int b = 1; b < 4; ++b)
                for (int c = 1; c < 4; ++c)
                    for (int d = 1; d < 4; ++d) {
                        if (a + b + c + d == s.length()) {
                            int n1 = Integer.parseInt(s.substring(0, a));
                            int n2 = Integer.parseInt(s.substring(a, a + b));
                            int n3 = Integer.parseInt(s.substring(a + b, a + b + c));
                            int n4 = Integer.parseInt(s.substring(a + b + c));
                            if (n1 <= 255 && n2 <= 255 && n3 <= 255 && n4 <= 255) {
                                ip.append(n1).append('.').append(n2)
                                        .append('.').append(n3).append('.').append(n4);
                                if (ip.length() == s.length() + 3) ret.add(ip.toString());
                                ip.delete(0, ip.length());
                            }
                        }
                    }
        return ret;
    }
}
