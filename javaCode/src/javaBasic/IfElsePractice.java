package javaBasic;
import java.util.Scanner;

public class IfElsePractice {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter your 1st sub marks: ");
        float sub1= sc.nextInt();
        System.out.print("Enter your 2nd sub marks: ");
        float sub2= sc.nextInt();
        System.out.print("Enter your 3rd sub marks: ");
        float sub3= sc.nextInt();

        float percentage=((sub1+sub2+sub3)/300)*100;
        System.out.println(percentage);

        if(((sub1/100)*100) >= 33 && ((sub1/100)*100) >= 33 && ((sub1/100)*100) >= 33){

            if(percentage>=40){
                System.out.println("you are passed");
            }
        }else{

            System.out.println("you are failed");
        }



    }
}
