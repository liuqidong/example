package com.liuqidong.example.sort;

import org.junit.Test;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;

/**
 * 冒泡排序
 */
public class BubbleSort {

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
        bubbleSort(arr);
//        System.out.println(Arrays.toString(arr));
        Instant endTime = Instant.now();
        System.out.println("共耗时：" + Duration.between(startTime, endTime).toMillis() + " 毫秒");
    }


    @Test
    public void bubbleSortTest(){
        int[] arr = {3, 9, -1, 10, 20};
        System.out.println("排序前：" + Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("排序后：" + Arrays.toString(arr));
    }
    
    public void bubbleSort(int[] arr){
        //相邻两个元素，比较大小，大的往后移,一趟下来最大的在最后面
        for (int i = 0; i < arr.length -1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
