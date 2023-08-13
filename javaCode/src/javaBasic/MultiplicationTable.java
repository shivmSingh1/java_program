package javaBasic;
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number for multiplication table");
        int num = sc.nextInt();

        int i=1, mul=1;

        while(i <= 10){

            mul = num * i;
            i++;

            System.out.println(mul);
        }

    }
}
