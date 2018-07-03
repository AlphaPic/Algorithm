package com.simple;

import java.util.Arrays;

/**
 * @author:fanwenlong
 * @date:2018-07-03 21:12:55
 * @E-mail:alpha18603074401@gmail.com
 * @mobile:186-0307-4401
 * @description:
 * @detail:
 */
public class GetSingleNumber {
    /**
     * 找到唯一的那个数字
     * @param nums
     * @return
     */
    public int singleNumber(int[] nums) {
        if (nums == null || nums.length <= 0){
            return Integer.MIN_VALUE;
        }else if (nums.length == 1){
            return nums[0];
        }else {
            int val = nums[0];
            for (int i = 1; i <nums.length;i++){
                val ^= nums[i];
            }
            return val;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,3,2,1};
        int res = new GetSingleNumber().singleNumber(nums);
        System.out.println(Arrays.toString(nums) + "中唯一的那个数为" + res);
    }
}
