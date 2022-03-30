package com.sorting;

public class BubbleSort {
    void bubbleSort(int[] array){
        for(int i=0;i< array.length;i++){
            for(int j=0;j< array.length-1;j++){
                if(array[j]>array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int[] array={1,4,2,4,5,3,6,7};
        bubbleSort.bubbleSort(array);
        for(int i : array){
            System.out.print(i+" ");
        }
    }
}
