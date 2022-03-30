package Fourte;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public boolean isAnagram(String first,String second){
        if(first.length()!=second.length()){
            return false;
        }
        first=first.toLowerCase();
        second=second.toLowerCase();
        char[] firstArray=first.toCharArray();
        char[] secondArray=second.toCharArray();
        Arrays.sort(firstArray);
        Arrays.sort(secondArray);
        int count=0;
        for(int i=0;i<firstArray.length;i++){
            if(firstArray[i]==secondArray[i]){
                count++;
            }
        }
        return count == second.length();
    }
    public static void main(String[] args) {
        Anagram anagram = new Anagram();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first word : ");
        String first=in.next();
        System.out.println("Enter first word : ");
        String second=in.next();
        if(anagram.isAnagram(first,second)){
            System.out.println("Your words are anagram...");
        }
        else{
            System.out.println("Your words are not anagram...");
        }
    }
}
