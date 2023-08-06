package javaBasic;
import java.util.Scanner;

//percentage of student from his marks of 3 subject out of 100 each.

public class CalculatePercentage {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of students-");
        System.out.println("in 1st subject- ");
        float marks1= sc.nextFloat();
        System.out.println("in 2nd subject- ");
        float marks2= sc.nextFloat();
        System.out.println("in 3rd subject- ");
        float marks3= sc.nextFloat();

        float percentage=((marks1+marks2+marks3)/300)*100;
        System.out.println(percentage +"%" );
    }
}
