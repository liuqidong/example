package com.liuqidong.example.sort;

import org.junit.Test;

import java.util.Arrays;

/**
 * 选择排序
 */
public class SelectSort {

    @Test
    public void selectSortTest(){
        int arr[] = {101, 34, 119, 1};
        System.out.println("原始数组：" + Arrays.toString(arr));
        selectSort(arr);
        System.out.println("排序后："+Arrays.toString(arr));
    }

    public void selectSort(int[] arr){
        //第一轮：以第一个元素为小值，如果有比该元素小的两者替换位置，完成后除去之前的的元素第1个为最小
        //第二轮：以二个元素为最小值，如果有比该元素小的两者替换位置，完成后除去之前的的元素第2个为最小
        //第三轮：以三个元素为最小值，如果有比该元素小的两者替换位置，完成后除去之前的的元素第3个为最小
        for (int i = 0; i < arr.length-1; i++) {
//            int min = 0;
//            for (int j = i+1; j < arr.length; j++) {
//                if(arr[i]>arr[j]){
//                    min = arr[i];
//                    arr[i]=arr[j];
//                    arr[j] = min;
//                }
//            }

            int min = arr[i];
            int minIndex = i;
            for (int j = i+1; j < arr.length; j++) {
                if(min>arr[j]){
                    min = arr[j];
                    minIndex = j;
                }
            }
            //i和minIndex交换
           arr[minIndex]=arr[i];
            arr[i] = min;
        }
    }
}
