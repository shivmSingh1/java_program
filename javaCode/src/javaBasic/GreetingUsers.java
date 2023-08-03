package javaBasic;
import java.util.Scanner;

public class GreetingUsers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String UserName = sc.nextLine();

        System.out.println("Hello "+ UserName + " ,have a good day.");
    }
}
