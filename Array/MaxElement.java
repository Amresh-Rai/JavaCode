package Array;
import java.util.*;

public class MaxElement {
    public static void main(String[] args) {
        
    
    int []arr={1,2,3,4,5,6,7,8};
   int result= findmaxelement(arr);
    System.out.println("the largest element in teh array is :"+result );

    
}
static int findmaxelement(int arr[]){
    int MAX= Integer.MIN_VALUE;
      for(int i=0;i<arr.length;i++){
        if(arr[i]>MAX){
            MAX=arr[i];

        }
      }
      return MAX;
}

}