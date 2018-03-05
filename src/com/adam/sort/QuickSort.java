package com.adam.sort;

import java.util.Arrays;

/**
 * @author adam
 * 创建于 2018-03-05 22:27.
 * 快速排序（从小到大）。
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] array = {6,8,4,3,5,2,9,1,7,19,-2};
        quicksort(array,0,array.length-1);
        System.out.println(Arrays.toString(array));
    }

    private static void quicksort(int[] array,int startIndex, int endIndex) {
        int index = restoreFirst(array,startIndex,endIndex);
        if(index==-1){
            return;
        } else {
            quicksort(array,startIndex,index);
            quicksort(array,index+1,endIndex);
        }
    }

    //返回值：归位后基准数index
    private static int restoreFirst(int[] array,int startIndex,int endIndex) {
        if(endIndex-startIndex <= 0){
            return -1;
        } else {
            int first = array[startIndex];  //基准数
            int leftWalker = startIndex, rightWalker = endIndex;  //左右哨兵
            while(true) {
                //从右面找一个比first小的数
                while(array[rightWalker] >= first && rightWalker > leftWalker)
                    rightWalker--;
                //从左面找一个比first大的数
                while(array[leftWalker] <= first && leftWalker < rightWalker)
                    leftWalker++;
                //当左右哨兵不等时，交换这两个哨兵指向的值
                if(leftWalker != rightWalker) {
                    int temp = array[leftWalker];
                    array[leftWalker] = array[rightWalker];
                    array[rightWalker] = temp;
                } else {  //否则将哨兵所指的值与基准数交换
                    array[startIndex] = array[leftWalker];
                    array[leftWalker] = first;
                    return leftWalker;
                }
            }
            //跳出循环时，基准数已归位
        }
    }

}
