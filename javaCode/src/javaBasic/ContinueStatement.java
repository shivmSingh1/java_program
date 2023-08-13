package javaBasic;
import java.util.Scanner;

public class ContinueStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int EndingNum= sc.nextInt();

        for(int i=0; i<=EndingNum; i++){

            if(i == 5){

                continue;  //goes back for next iteration when number is equal to 5. doesn't execute below statement
            }

            System.out.println(i);

        }
    }
}
