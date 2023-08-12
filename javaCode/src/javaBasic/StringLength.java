package javaBasic;

import java.util.Scanner;

public class StringLength {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your string");
        String name= sc.nextLine();

        int length= name.length();

        System.out.println("length of your string is: "+length);


    }
}
