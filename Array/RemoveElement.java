package Array;
import java.util.*;

public class RemoveElement {
    public static void main(String[] args) {
        int []nums ={0,0,1,2,3,4,6,2};
        int val= 2;
        int arr = removeElement(nums,val);
         System.out.println(Arrays.toString(Arrays.copyOf(nums,arr)));

    }
    static int removeElement(int []nums,int val){
        int k=0;
        for(int i=0;i<nums.length;i++){
             if(nums[i]!=val){
                nums[k]=nums[i];
               k++;
             }

        }
           return k ;
    }
    
}
