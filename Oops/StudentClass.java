package Oops;

public class StudentClass {
    
  public static void fun(Student x) {
    System.out.println(x.name);
    return; 
    
  }
  public static void change(int x){
    x=7;
    return ;
  
  }
  public static void change(Student s){
    s.name ="anmol";
}



    public static void main(String[] args) {
     Student s1= new Student("amresh",20,75);
    //  s1.name="amresh";
    //  s1.rno=20;
    //  s1.percentage=75;
    // s1.schoolname="JPS";
    
    //  System.out.println(s1.name);
    //  System.out.println(s1.rno);
    //  System.out.println(s1.percentage);

     Student s2=new Student("anmol",27,80);
    

     Student s3=new Student("chandan",45,75);
     System.out.println(s1.numberofstudents);
     System.out.println(s2.numberofstudents);
     System.out.println(s3.numberofstudents);
    // System.out.println(s1.schoolname);
    //    System.out.println(s2.name);
    //  System.out.println(s2.rno);
    //  System.out.println(s2.percentage);

    //  Student s1= new Student();
    //  s1.name="amresh";
    //  s1.percentage=75;
    // s1.rno=20;
    //System.out.println(s1.getRno());

    // s1.setRno(20);
    // System.out.println(s1.getRno());




        // Student s1=new Student();
        // System.out.println(s1.name);
        // s1.name= "Amresh";
        // s1.rno=20;
        // s1.percentage=75;
        // System.out.println(s1.name);

        // change(s1);
        // System.out.println(s1.name);

        // s1.name ="anmol";
        // System.out.println(s1.name);
        // int x=5;
        // System.out.println(x);
        // change(x);
        // System.out.println(x);


       // fun(s1);
        
        // Student s2 =new Student();
        // s2.name ="anmol";
        // s2.rno=27;
        // s2.percentage=80;




        
    }
    
  }
