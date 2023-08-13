package javaBasic;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number for factorial of it");
        int fact = sc.nextInt();

        for(int i=(fact-1); i>=1; i--){

            fact= fact * i;

        }

        System.out.println(fact);
    }
}
