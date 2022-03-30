package search;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter length of your array :");
        int length=in.nextInt();
        System.out.println("Enter your array values : ");
        int[] array=new int[length];
        for(int i=0;i<length;i++){
            array[i]=in.nextInt();
        }
        System.out.println("Enter your number for search : ");
        int search=in.nextInt();
        for(int i=0;i<length;i++){
            if(array[i]==search){
                System.out.println("your value is "+i+" th position.");
                break;
            }
        }
    }
}
