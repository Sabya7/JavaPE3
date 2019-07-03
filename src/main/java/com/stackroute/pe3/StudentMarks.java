package com.stackroute.pe3;
//Creating a class called StudentMarks, which prompts user for the number of students, reads it
//from the keyboard, and saves it in an int variable called numOfStudents. It then prompts user for the
//grades of each of the students and saves them in an int array called stuGrades. Program shall
//check that the grade is between 0 and 100 else has to trow an error message.
import java.util.Scanner;

public class StudentMarks {
      int NumberOfStudents;
     Scanner scanner=new Scanner(System.in);
    public void setNumberOfStudents(int n)
    {
        this.NumberOfStudents=n;
    }
    private  int[] stuGrades=new int[NumberOfStudents];
    public void setGrades()
    {   int check=0;
        for(int i=0;i<=NumberOfStudents;i++)
       {System.out.println("Grade of "+i+"Student?");
         check=scanner.nextInt();
       while(checkInvalidity(check))
       {
           System.out.println("Invalid input");
           check=scanner.nextInt();
       }
       stuGrades[i]=check;
       }
    }
    boolean checkInvalidity(int n)
    {
        if(n<100&&n>0)
            return false;

        else
            return true;
    }

}
