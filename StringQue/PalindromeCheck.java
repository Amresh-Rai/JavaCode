package StringQue;
import java.util.*;

public class PalindromeCheck {
    public static void main(String[] args) {
        String s="madam";
         boolean result =check(s);
         if(result==true){
            System.out.println("the entered String is palindrome string");
         }
         else{
            System.out.println("the entered string is not palindrome string");
         }
    }
     static boolean check(String s){
          s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int n= s.length();
        for(int i=0;i<n/2;i++){
            if(s.charAt(i)!=s.charAt(n-1-i)){
                return false;
            }

        }
        return true;

     }
    
}
