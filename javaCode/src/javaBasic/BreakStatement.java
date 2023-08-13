package javaBasic;
import java.util.Scanner;

public class BreakStatement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int EndingNum= sc.nextInt();

        for(int i=0; i<=EndingNum; i++){

            System.out.println(i);
            if(i == 10){

                break;  //exist from loop when number is at 10
            }
        }
    }
}
