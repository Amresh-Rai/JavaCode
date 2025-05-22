package Array;
import java.util.*;

public class TakeInput {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in );
        
        int n;
        System.out.println("enter the length of the array:");
        n=in.nextInt();
        System.out.println("take teh input from the user in the array:");
        int []arr=new int [n];
        for(int i=0;i<arr.length;i++){
         arr[i]=in.nextInt();


        }
        System.out.println(Arrays.toString(arr));

        
    }
    
}
