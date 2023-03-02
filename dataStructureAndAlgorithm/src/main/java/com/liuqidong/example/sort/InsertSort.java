package com.liuqidong.example.sort;

import org.junit.Test;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;

/**
 * 插入排序
 */
public class InsertSort {
    /**
     * 大量数据排序时间测试
     */
    @Test
    public void bulkDataSort() {
        int max = 80_000;
        int[] arr = new int[max];
        for (int i = 0; i < max; i++) {
            arr[i] = (int) (Math.random() * 80_000);
        }

        Instant startTime = Instant.now();
        insertSort(arr);
//        System.out.println(Arrays.toString(arr));
        Instant endTime = Instant.now();
        System.out.println("共耗时：" + Duration.between(startTime, endTime).toMillis() + " 毫秒");
    }

    @Test
    public void insertSortTest() {
        int arr[] = {101, 34, 119, 1};
        System.out.println("原始数组：" + Arrays.toString(arr));
        insertSort(arr);
        System.out.println("排序数组：" + Arrays.toString(arr));
    }


    public void insertSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int currentInsertValue = arr[i];
            int insertIndex= i-1;
            while (insertIndex >=0 && currentInsertValue <arr[insertIndex]){
                arr[insertIndex+1]=arr[insertIndex];
                insertIndex--;
            }
            arr[insertIndex+1]=currentInsertValue;
        }
    }
}
