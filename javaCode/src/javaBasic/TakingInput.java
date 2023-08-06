package javaBasic;
import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter 1st number: ");
        //Here int is primitive data type
        final int a= sc.nextInt();

        System.out.println("Enter 2nd number: ");

        //Here b is primitive data type
        final int b = sc.nextInt();

        //Here sum is primitive data type
        final int sum = a + b;
        System.out.print("sum is ");
        System.out.println(sum);
    }
}
