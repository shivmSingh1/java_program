package javaBasic;
import java.util.Scanner;

public class SwitchCaseURL {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Paste your website URL here");
        String URL= sc.nextLine();

        if( URL.endsWith(".com") || URL.endsWith(".com/") ){

            System.out.println("Commercial website");

        } else if(URL.endsWith(".org") || URL.endsWith(".org/") ){

            System.out.println("organisation website ");

        }else if(URL.endsWith(".in") || URL.endsWith(".in/") ){

            System.out.println("indian website");
        } else{

            System.out.println("Paste valid website URL");
        }

    }
}
