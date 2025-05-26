package Array;
import java.util.*;

public class MergeSort1 {
    
    public static void main(String[] args) {
        int[]arr={10,15,8,7,21,50};
         sort(arr,0,arr.length-1);

         System.out.println(Arrays.toString(arr));

        }
        static void sort(int []arr,int l,int r){
            if(l<r){
                int m = l+(r-l)/2;

                sort(arr,l,m);
                sort(arr,m+1,r);

                merge(arr,l,m,r);

        
            }
        }

        static void merge(int []arr,int l,int m,int r){

         int n1=m-l+1;
         int n2=r-m;

         int [] L1= 
            
        }
}
