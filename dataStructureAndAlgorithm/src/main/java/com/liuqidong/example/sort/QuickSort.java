package com.liuqidong.example.sort;

import org.junit.Test;

import java.util.Arrays;

/**
 * 快速排序
 */
public class QuickSort {
    @Test
    public void testSort(){
        int arr[] = {-9, 78, 0, 23, -567, 70};
        int left = 0;
        int right = arr.length - 1;
        System.out.println("原始数组：" + Arrays.toString(arr));
        quickSort(arr, left, right);
        System.out.println("排序后：" + Arrays.toString(arr));

    }

    /**
     *
     * @param arr 数组
     * @param left 最左侧
     * @param right 最右侧
     */
    public void quickSort(int[] arr,int left,int right){

        //最左侧
        int l = left;
        //最右侧
        int r = right;
        //1.在中间取一个基准值
        int pivotIndex = (left+right)/2;
        int pivot = arr[pivotIndex];
        //2.从左往右如果左侧的值大于pivot，则left和right互相交换位置
        //3.从右往左如果右侧的值小于pivot,则left和right互相交换位置
        while (l<r){
            //从左往右
            while (arr[l]<pivot){
                l++;
            }
            //从右往左
            while (arr[r]>pivot){
                r--;
            }
            //没有找到
            if(l>=r){
                break;
            }
            //两者交换
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;

            //下一轮，l往右，r往左
            r--;
            l++;
            System.out.println(Arrays.toString(arr)+"====");
        }
        //没有找到，中间值，l往右，r往左
        if(l==r){
            l++;
            r--;
        }
        //left____________r__pivot__l_________right
        //left小于r,组成一个分组
        if(left <r){
            quickSort(arr,left,r);
        }
        //right大与l
        if(right > l){
            quickSort(arr,l,right);
        }
    }
}
