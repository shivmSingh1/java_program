package javaBasic;

import java.util.Scanner;

public class StringInput {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your full name: ");

        //If the value of variable does not change then use final keyword
        final String name = sc.next();     //takes only first word as input
        System.out.println(name);

        Scanner scObj= new Scanner(System.in);
        System.out.println("Enter your full name again ");
        final String name2 = scObj.nextLine();    //takes full sentence as input
        System.out.println(name2);

    }
}
