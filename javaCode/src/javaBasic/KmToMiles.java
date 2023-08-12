package javaBasic;

import java.util.Scanner;

//convert kilometers to miles
public class KmToMiles {
    public static void main(String[] args) {
        // The Scanner class is used to get user input, and it is found in the java.util package.
        //Why it take System.in as input ??
        // ans- it shows that we take input from keyboard.
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter kilometer: ");
        //What is size of int data type ??
        // ans- 4 byte.
        // 1 bit is equal is how many bytes ? 
        //ans- 1/8 bytes
        // Difference between bit and bytes ?
        // bit is samllest unit of data which have only 0 and 1. byte is the collection of bits in which 1 byte is eqaul to 8 bits
        int kilometers = sc.nextInt();


        //Can we use float as data type here ?
        // ans- yes we can use float data type here. float have smaller storage capacity than double so double give more accurate answer to more decimal point for larger numbers.
        double miles = (kilometers * 0.621371);
        System.out.println(kilometers + " kilometer is equal to " + miles + " miles.");
    }
}
