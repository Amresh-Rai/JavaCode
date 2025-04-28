package basic;

import java.util.Scanner;

public class AreaRectangle {

    public int findarea(int length,int width){

     return length*width;
    }
    public static void main(String[] args) {
        
    
    Scanner sc=new Scanner(System.in);
   
    System.out.println("Enter the length of the reactangle:");
    int length=sc.nextInt();
    System.out.println("Enter the width of the rectangle :");
    int width= sc.nextInt();
     
    AreaRectangle obj= new AreaRectangle();
   
    System.out.println("Area of the reactangle is :="+ obj.findarea(length,width));
 
}
}