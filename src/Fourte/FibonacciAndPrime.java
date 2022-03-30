package Fourte;

public class FibonacciAndPrime {
    public static void main(String[] args) {
        int first=-1;
        int second=1;
        for(int i=1;i<=10;i++){
            int fib=first+second;
            int count=0;
            if(fib>=2) {
                for (int j = 2; j < fib/2; j++) {
                    if (fib % j == 0) {
                        count++;
                    }
                }
                if(count==0){
                    System.out.println(fib);
                }
            }
            first=second;
            second=fib;
        }
    }
}
