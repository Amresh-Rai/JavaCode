package Array;

public class CountTheEvenElementArray {
   public static void main(String[] args) {
     int []arr={2,3,6,7,8,10,4};
    int result=evenelement(arr);
    System.out.println(result);

    
   }
   static int  evenelement(int arr[]){
    int count=0;
    for(int i=0;i<arr.length;i++){
        if(arr[i]%2==0){
          count++;

        }
        
   }
   return count;
    }

}
