package Oops;

public class inheritance {
    public static void main(String[] args) {
        // B b = new B();
        // b.printA();
        C c= new C();
        c.printA();
    }
}

class A{
    int x = 20;

    void printA(){
        System.out.println(x+" from A");
    }
}

class B extends A{
    int x = 50;

    void printA(){
        System.out.println(x+" from B "+super.x);
    }
}
class C extends B{
    int x=30;
    void printA(){
        System.out.println(x+" from C "+super.x+" from B "+super.x+" from A ");
    }
    
}