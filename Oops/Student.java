package Oops;

public class Student{
 String name ;
  int rno;
  // private int rno; 
    double percentage;
    final String schoolname = "KVS";
    static int numberofstudents;

      public Student(){

      }
    public Student(String name,int rno,double percentage){
    this.name =name;
    this.rno=rno;
    this.percentage =percentage;
    numberofstudents++;

    }

    public int getRno(){  //getter
        return rno;
    }
    public void setRno(int rno){  //setter
       this.rno= rno;
    }

  }
