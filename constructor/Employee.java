package constructor;

import java.util.Scanner;

class emp{
    int empid;
    String name;
    int salary;
     
    Scanner sc =new Scanner(System.in);

    public void fun(){
      System.out.println("name = "+ name +" , salary = "+salary + " , empid = "+empid);

    }

  //   emp(){
  //    System.out.println("Default constructor");
  //    System.out.println("Enter emp id, name, salary");
  //   empid=sc.nextInt();
  //   sc.nextLine();
  //   name=sc.nextLine();
  //   salary=sc.nextInt();
  // }

    emp(int empid, String name, int salary) {
        this.empid = empid;
        this.name = name;
        this.salary = salary;
    }
    emp(emp s){
      this.empid=s.empid;
      this.name=s.name;
      this.salary=s.salary;
    }
}

   class Employee{
    public static void main(String[] args) {
        // emp e = new emp();
        // e.fun();
        emp e1 = new emp(111111 ,"amresh"  ,55000);
        e1.fun();
        emp copy = new emp(e1);
        copy.fun();
    }
  }

