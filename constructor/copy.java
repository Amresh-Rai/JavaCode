package constructor;

public class copy {
	int a,b;

    copy(int a,int b){
        this.a=a;
        this.b=b;
        System.out.println("a="+a+" , b= "+b);
    }
    copy(copy s){
        this.a=s.a;
        this.b=s.b;
        System.out.println("a="+a+" , b= "+b);
        
    }
    public static void main(String[] args) {
        copy obj1=new copy(10,20);
        copy obj2=new copy(obj1);

    }
}