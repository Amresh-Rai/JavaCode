package basic;
import java.util.*;

public class PalindromeNumber {
    public static void main(String[] args) {

      boolean result=isPalindrome(-121);
      if(result==true){
        System.out.println("it is a plaindrome number");
      }
      else{
        System.out.println("it is not a plaindrome number");
      }
      
        
    }
    static boolean isPalindrome(int x){
        if(x<0){
            return false;
        }
        int ld,rev=0,org=0;
        org=x;
        while(x!=0){
           ld=x%10;
           rev=rev*10;
           rev=rev+ld;
          
           x=x/10;
           
        }
      
       return rev==org;
        }
    }


