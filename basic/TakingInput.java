package basic;
import java.util.Scanner; 
public class TakingInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("taking the input from the user:");
       // System.out.print("enter the first number:");

       // Boolean b1 =sc. hasNextInt();
       
       // int a = sc.nextInt();
       // float a = sc.nextFloat();

        //System.out.print("enter the second number:");

       // int b = sc.nextInt();
        // float b= sc.nextFloat();

        // int sum = a+b;
         //float sum = a+b;
       // String str = sc.next(); 
        String str = sc.nextLine();

         
        // System.out.println(sum);
      //  System.out.println(b1);
        System.out.println(str);
        sc.close();
    }
    
    
}
