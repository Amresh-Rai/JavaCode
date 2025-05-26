package StringQue;

public class shiftString { /// **************  leetc code 796 ***************
    public static boolean fun(String s, String goal){
        StringBuilder str = new StringBuilder(s);
        for(int i =0; i<s.length(); i++){
            if(str.toString().equals(goal)){
                System.out.println(str);
               return true;
            }
            char ch = str.charAt(0);
            str.deleteCharAt(0);
            str.append(ch);  
        }
        System.out.println(str);
        return false;
    }
    public static void main(String[] args) {
        String s = "abcde";
        String goal = "cdeab";

        System.out.println(fun(s,goal));
    }
}
