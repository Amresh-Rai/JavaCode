package StringQue;

import java.util.Arrays;

public class frequencyElement { //// ************** leet code 451 *************
    public static void main(String[] args) {
        String s = "Aacc";

        System.out.println(fun(s));
    }


    public static String fun(String s){
       int freq[] = new int[128];

      char [] ch = s.toCharArray();

      for(char i : ch){
        freq[i]++;
      }

      StringBuilder res = new StringBuilder();

      
    }
}
