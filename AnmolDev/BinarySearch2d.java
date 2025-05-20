package AnmolDev;

import java.util.Arrays;

public class BinarySearch2d {
    public static void main(String[] args) {
        int arr[][] ={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        int temp[][] = new int[arr.length][arr[0].length];
        
        for(int i = 0; i< arr.length; i++){
            for(int j =0; j<arr[0].length; j++){
                temp[j][i] = arr[i][j];
            }
        }

    
       System.out.println(Arrays.deepToString(temp));

       int res[] = res(temp, 5);
       System.out.println(Arrays.toString(res));
        
    }

    public static int[] res(int arr[][],int target){

        int r=0;
        int c=arr.length -1;
        while (r<arr.length && c>=0){
            if(arr[r][c] ==target){
                return new int[]{r,c};
            }
            if(arr[r][c] < target){
                r++;

            }else{
                c--;
            }
        }
        return new int []{-1,-1};
    }
}

