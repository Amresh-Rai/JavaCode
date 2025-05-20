package LinearSearchIn1DArray;

public class SearchInArray {
    public static void main(String[] args) {
        
        int []arr={1,2,3,4,5,6,7,8,9};
        int ans=linearsearch(arr,5);
        System.out.println(ans);
        
    }

    static int linearsearch(int arr[],int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]== target){
                 return i;
            }
            
        }
return -1;
    }
    
}
