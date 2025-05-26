package Array;

public class countDigit {
    public static void main(String[] args) {
        int arr[] = {12,8,123,1234};

        System.out.println(fun(arr));
    }

    public static int fun(int []arr){
        int count = 0;

        for(int i =0; i<arr.length; i++){
            if(digit(arr[i])==true){
                count++;
            }
        }

        return count;
    }


    public static boolean digit(int n){
        int count = 0;

        while(n!=0){
            n/=10;
            count++;
        }

        if(count%2 == 0)  return true;
           else  return false;
    }
}
