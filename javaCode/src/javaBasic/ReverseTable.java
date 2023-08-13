package javaBasic;

import java.util.Scanner;

public class ReverseTable {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number for print table in reverse");
        int num= sc.nextInt();

        for(int i=10; i>=1; i--){

            int mul= num * i;
            System.out.println(mul);

        }
    }
}
