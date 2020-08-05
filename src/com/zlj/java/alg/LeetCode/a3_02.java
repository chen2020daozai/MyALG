package com.zlj.java.alg.LeetCode;

import java.util.HashMap;

/**
 * @Classname a3
 * @Date 2020/8/5
 * @Created by 陈刀仔
 * @Description TODO
 */

public class a3_02 {
    public static void main(String[] args) {
        String s = "au";
        int i = lengthOfLongestSubstring(s);
        System.out.println(i);
    }

    public static int lengthOfLongestSubstring(String s) {
        int a = s.length();
        int out = 1;

        if (s.length() > 1) {
            HashMap<Integer, Character> map = new HashMap<>();
            for (int j = 0; j < s.length(); j++) {
                map.clear();
                for (int k = j; k < s.length(); k++) {
                    if (!map.containsValue(s.charAt(k))) {
                        map.put(k, s.charAt(k));
                        out = Math.max(map.size(), out);
                    } else {
                        out = Math.max((k - j), out);
                        break;
                    }
                }
            }
        }else if (s.length()==0)out=0;
        return out;
    }

}
