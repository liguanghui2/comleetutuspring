package com.leetutu.sort;

/** 排序算法练习
 * @author: Kevin.Lee
 * @create: 2018-01-01 17:35:34
 **/
public class Sort {

    public static void main(String[] args) {
        int[] arr={1,3,2,7,4,9,5,0,7,6,8};
        //insertSort(arr);
        selectSort(arr);
        for (int i = 0; i <arr.length ; i++) {
            System.out.printf("["+arr[i]+"]");
        }
    }

    /**
     * 插入排序：在要排序的一组数中，假设前面(n-1)[n>=2]个数已经是排好序的，现在要不第n个数插入到前面的有序数中，
     * 使得这n个数也是排好序的，如此反复循环，直到全部排好顺序。
     */
    private static void insertSort(int[] arr){
        for (int i = 1; i <arr.length ; i++) {
              int j=i-1;
              int temp=arr[i];
            for (; j>= 0 && temp <arr[j]; j-- ) {
                arr[j+1]=arr[j];
            }
            arr[j+1]=temp;
        }
    }

    /**
     *
     * 选择排序：在要排序的一组数中，选出最小的一个数与第一个位置的数交换，
     * 然后在剩下的数当中再找最小的与第二个位置的数交换，如此循环到倒数第二个数和最后一个数比较为止。
     */
    private static void selectSort(int arr[]){
        for (int i = 0; i <arr.length ; i++) {
            int position =i;
            int temp=arr[i];
            for(int j=i+1; j<arr.length;j++){
                if (arr[j]<temp){
                    temp=arr[j];
                    position=j;
                }
                }
                arr[position]=arr[i];
            arr[i]=temp;
            }
        }

}
