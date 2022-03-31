package Fourte;

import java.util.Scanner;

public class ArrayProblem {
    public void solution(int[] array,int k){
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if((array[i]+array[j])%k==0){
                    System.out.println(array[i]+" "+array[j]);
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your array length :");
        int length = in.nextInt();
        int[] array = new int[length];
        System.out.println("enter your array elements :");
        for(int i=0;i<length;i++){
            array[i]=in.nextInt();
        }
        System.out.println("Enter k value :");
        int k=in.nextInt();
        ArrayProblem arrayProblem = new ArrayProblem();
        arrayProblem.solution(array,k);
    }
}
