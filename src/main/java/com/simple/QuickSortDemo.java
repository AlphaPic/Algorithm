package com.simple;

import java.util.Arrays;
import java.util.Random;

/**
 * @author:fanwenlong
 * @date:2018-07-03 13:39:50
 * @E-mail:alpha18603074401@gmail.com
 * @mobile:186-0307-4401
 * @description:
 * @detail:
 */
public class QuickSortDemo {
    private int count = 1;
    /**
     * 快排
     * @param arr
     * @return
     */
    public int[] quickSort(int[] arr){
        if (arr == null || arr.length <= 0){
            return null;
        }

        quickSortWithIndex(arr,0,arr.length - 1);
        return arr;
    }

    private void quickSortWithIndex(int[] arr, int low, int high) {
        if (low < high){
            int pivotol = parttionArr(arr,low,high);
            System.out.println("第" + count++ + "次排序:" + Arrays.toString(arr));
            quickSortWithIndex(arr,low,pivotol - 1);
            quickSortWithIndex(arr,pivotol + 1,high);
        }
    }

    private int parttionArr(int[] arr, int low, int high) {
        int pivtol = arr[low];
        while (low < high){
            while (low < high && arr[high] >= pivtol){
                high--;
            }
            arr[low] = arr[high];
            while (low < high && arr[low] <= pivtol){
                low++;
            }
            arr[high] = arr[low];
        }
        arr[low] = pivtol;
        return low;
    }


    public static void main(String[] args) {
        Integer len = 10;
        Random rand = new Random(System.currentTimeMillis());
        int[] arr = new int[len];
        for (int i = 0;i < arr.length;i++){
            arr[i] = rand.nextInt(100);
        }
        int[] res = new QuickSortDemo().quickSort(arr);
    }
}
