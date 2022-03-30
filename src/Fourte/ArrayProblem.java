package Fourte;

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
        int[] array={1,2,3,4,5,6};
        ArrayProblem arrayProblem = new ArrayProblem();
        int k=6;
        arrayProblem.solution(array,k);
    }
}
