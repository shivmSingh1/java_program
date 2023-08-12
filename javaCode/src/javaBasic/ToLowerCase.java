package javaBasic;

import java.util.Scanner;
public class ToLowerCase {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your string: ");
        String name= sc.nextLine();

        System.out.println(name.toLowerCase());

    }
}
