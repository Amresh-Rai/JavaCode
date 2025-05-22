package basic;

public class Solution {
    public static void main(String[] args) {
        int[]nums={8,3,2};
     String result= triangleType(nums);
     System.out.println(result);
        
    }

   static String triangleType(int[] nums) {
    if(nums[0]+nums[1]<=nums[2] ||nums[1]+nums[2]<=nums[0] ||nums[2]+nums[0]<=nums[1] ){
        return "none";
    }
        if(nums[0]==nums[1] && nums[1]==nums[2]){
            return "equilateral";
        }
        else if (nums[0]!=nums[1] && nums[1]!=nums[2] && nums[0]!=nums[2]){
            return "scalene";
        }
        else{
            return "isocelses";
        }
        
    }
}
    
