package Sorting;
import java.util.*;

public class BubbleSort {
    public static void main(String[] args) {
        int []arr={9,8,7,6,5,4,3,2,1};
        bubblesort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubblesort(int arr[]){

         for(int i=0;i<arr.length-1;i++){
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                      arr[j]=temp;                }
            }
         }
}
    
}
