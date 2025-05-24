package Array;

public class MajorityElement {
    public static void main(String[] args) {
        int []arr={3,3,3,2,2,3,2,2,3,3,3,3};
        int result=findelement(arr);
        System.out.println(result);
        
    }
    static int findelement(int arr[]){
        int count=0;
        int candidate=-1;
        for(int i=0;i<arr.length;i++){
            if(count==0){
                candidate=arr[i];
                count++;
            }
            else{
                if(arr[i]==candidate){
                   count++;

                }
                else{
                    count--;
                }
            }
            

        }

        count =0;

        for(int i : arr){
            if(i == candidate){
                count++;
            }
        }


        if(count > arr.length/2) return candidate;
        else return -1;

    }
    
}
