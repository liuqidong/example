package com.liuqidong.example.sort;

import org.junit.Test;

import java.util.Arrays;

/**
 * 希尔排序
 */
public class ShellSort {

    @Test
    public void shellSortTest() {
        int arr[] = {8, 9, 1, 7, 2, 3, 5, 4, 6, 0};
        System.out.println("原始数组：" + Arrays.toString(arr));
//        shellSort(arr);
        moveShellSort(arr);
        System.out.println("排序数组：" + Arrays.toString(arr));
    }
    public void shellSort(int[] arr){

        int temp = 0;
        for (int gap = arr.length/2 ; gap >0 ; gap /=2) {
            for (int i = gap; i < arr.length; i++) {
                for (int j = i-gap; j >=0 ; j-=gap) {
                    if(arr[j]>arr[j+gap]){
                        temp = arr[j];
                        arr[j] = arr[j+gap];
                        arr[j+gap] = temp;
                    }
                }
            }
        }

//        //[8, 9, 1, 7, 2, 3, 5, 4, 6, 0]
//        //第一次：10/2=5
//        for (int i = 5; i < arr.length; i++) {
//            for (int j = i-5; j >=0 ; j-=5) {
//                if(arr[j]>arr[j+5]){
//                    temp = arr[j];
//                    arr[j] = arr[j+5];
//                    arr[j+5] = temp;
//                }
//            }
//        }
    }


    public void moveShellSort(int[] arr){
        for (int gap = arr.length/2 ; gap >0 ; gap /=2) {
            for (int i = gap; i < arr.length; i++) {
               int currentInsertValue = arr[i];
               int insertIndex= i - gap;
               while (insertIndex >=0 && currentInsertValue < arr[insertIndex]){
                   arr[insertIndex+gap] = arr[insertIndex];
                   insertIndex-=gap;
               }
               arr[insertIndex+gap] = currentInsertValue;
            }
        }

    }
}
