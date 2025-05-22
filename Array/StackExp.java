package Array;


public class StackExp {
    public static void fun1(){
        fun2();
    }
    public static void fun2(){
        fun3();
    }
    public static void fun3(){
     System.out.println(25/0);
    }
    
    public static void main(String[] args) {
        fun1();
    }
}
