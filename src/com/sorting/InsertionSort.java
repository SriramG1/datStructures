package com.sorting;

public class InsertionSort {
    public void sort(int[] array){
        for(int i=1;i< array.length;i++){
            for(int j=i;j>0;j--){
                if(array[j]<array[j-1]){
                   int temp=array[j];
                   array[j]=array[j-1];
                   array[j-1]=temp;
                }
                else{
                    break;
                }
            }
        }
        for(int i:array){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        InsertionSort insertion = new InsertionSort();
        int[] array={9,3,5,7,3,2,5,8,1};
        insertion.sort(array);
    }
}
