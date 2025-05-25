package Array;

import java.util.*;

public class RemoveDuplicateElement {
  static int Deldup(int arr[],int n){
    int count = 0;
    int end = n -1;
      for(int i =0; i<n-1; i++){
        if(arr[i] == -1) continue;

        for(int j = i+1; j<n; j++){
            if(arr[i] == arr[j]){
              count++;
              arr[j] = -1;
              int temp = arr[i];
              arr[i] = arr[j];
              arr[j] = temp;
              end --;
            } 
            
            
        }
      }

      return n - count;
  } 
    public static void main(String[] args) {
        int []arr={1,1,1,1,1,1,1,1};
        int n = arr.length;

      //   ArrayList<Integer> list = new ArrayList<>();

      //   for(int i : arr){
      //     if(!list.contains(i))  list.add(i);
      //   }
        
      // System.out.println(list);

     n =  Deldup(arr,n);

     for(int i = 0; i<n; i++){
      System.out.print(arr[i]+" ");
     }
    }

    
}
