package com.zlj.java.alg.LeetCode;

import java.util.HashMap;
import java.util.Map;

/**
 * 两数之和
 * @Classname a1
 * @Date 2020/8/5
 * @Created by 陈刀仔
 * @Description TODO
 */

public class a1 {
    public static int[] twoSum(int[] nums, int target){
        int[] a=new int[2];
        a[0]=-1;
        a[1]=-1;
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int key=target-nums[i];
            if (!map.containsKey(key)){
                map.put(nums[i],i);
            }else {
                a[0]=map.get(key);
                a[1]=i;
                return a;
            }
        }
        return a;
    }
}
