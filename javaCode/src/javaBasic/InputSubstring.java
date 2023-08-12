package javaBasic;
import java.util.Scanner;

public class InputSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your string");
        String sentence= sc.nextLine();

        System.out.print("Enter starting index of string to make substring: ");
        int n= sc.nextInt();

        String SubSentence= sentence.substring(n);
        System.out.println(SubSentence);
    }
}
