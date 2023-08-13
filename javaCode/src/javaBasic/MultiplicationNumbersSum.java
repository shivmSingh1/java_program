package javaBasic;
import java.util.Scanner;

public class MultiplicationNumbersSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number for sum of the numbers occuring in it multiplication table");
        int num= sc.nextInt();

        int mul=1, sum=0;

        for(int i=1; i<=10; i++){

            mul = num*i;
            System.out.println(sum+ "+" +mul+ "=" +(sum + mul));
            sum= sum + mul;



        }
        System.out.println("total sum = "+sum);
    }
}
