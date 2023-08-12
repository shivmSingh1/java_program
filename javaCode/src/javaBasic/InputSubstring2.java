package javaBasic;
import java.util.Scanner;

public class InputSubstring2 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your string");
        String sentence= sc.nextLine();

        System.out.print("Enter starting index for substring: ");
        int start= sc.nextInt();

        System.out.print("Enter ending index for substring: ");
        int end= sc.nextInt();

        String substring= sentence.substring(start,end);
        System.out.println(substring);
    }
}
