package javaBasic;
import java.util.Scanner;

public class SumFirstNno {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n= sc.nextInt();
        int i=1, sum=0;

        while (i<=n){

            sum = sum + i;
            i++;
        }

        System.out.println(sum);
    }
}
