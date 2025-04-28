package constructor;

public class improtent {
    int id;
    String name;
     
    improtent(){
        System.out.println("id="+id+", Name="+name);

    }
    improtent(int id,String name){
        System.out.println("id="+id+" Name="+name);
    }

    public static void main(String[] args) {
        improtent obj=new improtent();
        improtent obj1=new improtent(1234 ,"shivam");
    }


    
}
