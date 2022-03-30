package com.sorting;

public class MergeSort {
    public void sort(int[]array){
        int left=0;
        int right=array.length-1;
        int mid=(left+right)/2;
        int leftLength=mid-left+1;
        int rightLength=right-mid;
        int[] leftArray=new int[leftLength];
        int[] rightArray=new int[rightLength];
        for(int i=0;i<leftLength;i++){
            leftArray[i]=array[i];
        }
        for(int i=0;i<rightLength;i++){
            rightArray[i]=array[mid+1+i];
        }
    }
    public static void main(String[] args) {
        MergeSort mergeSort = new MergeSort();
        int[] array= {1,3,6,2,2,6,8};
        mergeSort.sort(array);
    }
}
