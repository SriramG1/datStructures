package com.sorting;

public class SelectionSort{
    public void sort(int[] array){
        for(int i=0;i<array.length-1;i++) {
            int smallest=array[i];
            int index=i;
            for (int j = i+1; j < array.length; j++) {
                if(array[j]<smallest){
                    smallest=array[j];
                    index=j;
                }
            }
            int temp=array[i];
            array[i]=array[index];
            array[index]=temp;
        }
        for(int i:array){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        SelectionSort selection= new SelectionSort();
        int[] array={2,4,1,4,6,7,5,3};
        selection.sort(array);
    }
}
