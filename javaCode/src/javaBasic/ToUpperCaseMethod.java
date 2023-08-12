package javaBasic;

import java.util.Scanner;
public class ToUpperCaseMethod {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your string");
        String sentence= sc.nextLine();

        System.out.println(sentence.toUpperCase());
    }
}
