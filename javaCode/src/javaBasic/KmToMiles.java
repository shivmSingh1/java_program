package javaBasic;

import java.util.Scanner;

//convert kilometers to miles
public class KmToMiles {
    public static void main(String[] args) {
        // The Scanner class is used to get user input, and it is found in the java.util package.
        //Why it take System.in as input ??
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter kilometer: ");
        //What is size of int data type ??
        // 1 bit is equal is how many bytes ?
        // Difference between bit and bytes ?
        int kilometers = sc.nextInt();


        //Can we use float as data type here ?
        double miles = (kilometers * 0.621371);
        System.out.println(kilometers + " kilometer is equal to " + miles + " miles.");
    }
}
