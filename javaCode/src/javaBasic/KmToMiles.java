package javaBasic;
import java.util.Scanner;

//convert kilometers to miles
public class KmToMiles {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.print("Enter kilometer: ");
        int kilometers= sc.nextInt();

        double miles = ( kilometers * 0.621371);
        System.out.println(kilometers+" kilometer is equal to "+miles+" miles.");
    }
}
