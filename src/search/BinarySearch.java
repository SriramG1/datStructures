package search;

public class BinarySearch {
    private int search(int[] array,int first,int last,int number){
        if(last>=first){
            int mid=(first+last)/2;
            if(array[mid]==number){
                return mid;
            }
            if(array[mid]<number){
                return search(array,mid+1,last,number);
            }
            if(array[mid]>number){
                return search(array,first,mid-1,number);
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        //Use in sorted array
        BinarySearch binarySearch = new BinarySearch();
        int[] array={1,2,3,4,5,6,7,8,9};
        int number=9;
        int result=binarySearch.search(array,0, array.length-1,number);
        if(result==-1){
            System.out.println("Your value is not in array");
        }
        else {
            System.out.println("Index of your number is "+result);
        }
    }
}
