package BinarySearchIn1DArray;

public class BinarySearch {
    public static void main(String[] args) {
        int []arr ={1,2,3,4,5};
        int ans=binarysearch(arr,4);
        System.out.println(ans);
        
    }
  static int binarysearch(int arr[],int target){
    int start=0;
    int end = arr.length -1;
    while(start<=end){
        int mid = start + (end -start)/2;
        //int  mid=(start+end)/2;

        if(target> arr[mid]){ 
            start= mid+1;
        }
        else if(target<arr[mid]){
            end=mid-1;
        }
        else{
            return mid;
        }


    }
    return -1;

  }
    
}
