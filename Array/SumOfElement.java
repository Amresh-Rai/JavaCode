package Array;

public class SumOfElement {
    public static void main(String[] args) {
        int []arr={1,2,3,5,6};
        int result=add(arr);
        System.out.println(result);

    }
    static int add(int []arr){
        int count=0;
        for(int i=0;i<arr.length;i++){
               count +=arr[i];
        }
        return count;
    }
    
}
