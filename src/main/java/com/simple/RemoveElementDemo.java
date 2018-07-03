package com.simple;

import java.util.Arrays;

/**
 * @author:fanwenlong
 * @date:2018-07-03 11:24:15
 * @E-mail:alpha18603074401@gmail.com
 * @mobile:186-0307-4401
 * @description:
 * @detail:
 */
public class RemoveElementDemo {

    public int removeElement(int[] nums, int val) {
        if (nums == null || nums.length == 0){
            return 0;
        }
        int len = nums.length;
        for (int i = 0;i < len;){
            if (val == nums[i]){
                for (int k = i + 1;k < nums.length;k++){
                    nums[k - 1] = nums[k];
                }
                len--;
            }else {
                i++;
            }
        }
        return len;
    }

    public static void main(String[] args){
        int[] arr = {1,2,23,1,23,1,34,4,5,5,1,1,2,39,7,1,1,23,12,1,4,5,3456,5,67,567,567,567,567,56,7};
        int [] arr1 = {3,2,2,3};
        int len = new RemoveElementDemo().removeElement(arr1,3);
        System.out.println("原先的长度为:" + arr.length + ",移除之后的长度为:" + len);
        for (int i = 0;i < len;i++){
            System.out.print(arr1[i] + ",");
        }
        System.out.println();
    }
}
