package com.simple;

import java.util.Arrays;

/**
 * @author:fanwenlong
 * @date:2018-07-03 13:30:04
 * @E-mail:alpha18603074401@gmail.com
 * @mobile:186-0307-4401
 * @description:
 * @detail:
 */
public class FindMaxSubArray {
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length <= 0){
            return Integer.MIN_VALUE;
        }
        int count = 0;
        int max = Integer.MIN_VALUE;
        int start = 0,end = 0;
        for (int i = 0;i < nums.length;i++){
            if (count <= 0){
                start = i;
                count = nums[i];
            }else {
                count += nums[i];
            }

            if (count > max){
                end = i;
                max = count;
            }
        }

        System.out.println("在数组中的start = " + start + ",end = " + end);
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int val = new FindMaxSubArray().maxSubArray(arr);
        System.out.println(Arrays.toString(arr) + "的子数组的最大值为" + val);
    }
}
