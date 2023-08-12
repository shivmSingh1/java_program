package javaBasic;
import java.util.Scanner;

public class ReplaceSpaceWithUnderscores {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your string");
        String sentence = sc.nextLine();
        sentence= sentence.replace(" ", "_");

        System.out.println(sentence);

    }
}
