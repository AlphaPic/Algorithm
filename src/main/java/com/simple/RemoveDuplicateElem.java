package com.simple;

import java.util.Random;

public class RemoveDuplicateElem {
    public static int removeDuplicates(int[] nums) {
        if (nums == null){
            return 0;
        }else if (nums.length <= 1){
            return nums.length;
        }else {
            int slow = 0;
            for (int fast = 1;fast < nums.length;fast++){
                if (nums[fast] != nums[slow]){
                    slow++;
                    nums[slow] = nums[fast];
                }
            }
            return slow + 1;
        }
    }

    private static int[] generateASortedArr(Integer len){
        Random random = new Random();
        int[] arr = new int[len];
        for (int i = 0;i < len;i++){
            arr[i] = random.nextInt(len);
        }
        //
        for (int i = 1;i < len;i++){
            int val = arr[i];
            int j = i - 1;
            for (;j >= 0;j--){
                if (arr[j] > val){
                    arr[j + 1] = arr[j];
                }else {
                    break;
                }
            }
            arr[j + 1] = val;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = generateASortedArr(20);
        for (int i = 0;i < arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int len = removeDuplicates(arr);
        System.out.println("length after handle " + len);
        for (int j = 0;j < len;j++){
            System.out.print(arr[j] + " ");
        }
    }
}
