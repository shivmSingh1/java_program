package javaBasic;
import java.util.Scanner;

public class ForLoopOddNum {
    public static void main(String[] args) {

        //print n odd numbers

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int EndingNum= sc.nextInt();

        for(int i=0; i<=EndingNum; i++){

            if(i % 2 == 0){

                System.out.println(i);
            }
        }
    }
}
