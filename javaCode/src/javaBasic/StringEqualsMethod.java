package javaBasic;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class StringEqualsMethod {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your 1st srting");
        String sentence1st= sc.nextLine();

        System.out.println("Enter your 2nd string");
        String sentence2nd= sc.nextLine();

        System.out.println("string 1st is equals to string 2nd? "+sentence1st.equals(sentence2nd));

    }
}
