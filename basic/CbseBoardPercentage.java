package basic;

import java.util.Scanner;

public class CbseBoardPercentage {
    public static void main(String[] args) {
         Scanner marks = new Scanner(System.in);

         System.out.println("CBSE BOARD PERCENTAGE:");

         System.out.print("Enter the marks obtained:");
         int obtainedMarks = marks.nextInt();

         System.out.print("enter the total marks ");
         int totalMarks = marks.nextInt();

         float percentage = (obtainedMarks*100)/totalMarks;
         System.out.println(percentage);
         marks.close();
    }
    
}
