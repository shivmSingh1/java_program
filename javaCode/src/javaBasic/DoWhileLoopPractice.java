package javaBasic;
import java.util.Scanner;

public class DoWhileLoopPractice {
    public static void main(String[] args) {
        //print n natural numbers

        int num=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
       int EndingNum= sc.nextInt();

        do{
            System.out.println(num);
            num++;

        }while (EndingNum >= num);
    }
}
