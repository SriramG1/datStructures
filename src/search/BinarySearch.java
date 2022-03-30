package search;

public class BinarySearch {
    private void search(int[] array,int number){
        int min=0;
        int max= array.length;
        while(min<max){
            int mid=(min+max)/2;
            if(array[mid]==number){
                System.out.println("Your position is : "+mid);
                break;
            }
            else if(array[mid]<number){
                min=mid+1;
            }
            else{
                max=mid-1;
            }
        }
    }
    public static void main(String[] args) {
        //Use in sorted array
        BinarySearch binarySearch = new BinarySearch();
        int[] array={1,2,3,4,5,6,7,8,9};
        int number=6;
        binarySearch.search(array,number);
    }
}
