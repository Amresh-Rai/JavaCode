package basic;
import java.util.*;


public class TwoSum {
    public static void main(String[] args) {
        int []nums={1,2,3};
        int []result=addup(nums,5);
        System.out.println(Arrays.toString(result));

    }
    static int[]addup(int nums [],int target){
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]== target){

                    return new int[]{i,j};
                }
            }
        }
        return new int []{-1,-1};
    }
    
}
