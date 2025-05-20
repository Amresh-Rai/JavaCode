package Array;
import java.util.*;

public class SortArray {
    public static void main(String[] args) {
        int []arr={10,40,28,13,35,50};
        sortarray(arr);
        System.out.println(Arrays.toString(arr));


    }
    static void sortarray(int []arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
            if(arr[j]<arr[i]){
                int temp= arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
             
        }
    }
    
}
