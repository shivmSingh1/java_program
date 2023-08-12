package javaBasic;
import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {

        int computerWins= 0, userWins = 0;

        Random rn = new Random();

        Scanner sc = new Scanner(System.in);
        int round=1;

        do{

            int computerNumber= rn.nextInt(3);

            // System.out.println(computerNumber);

            System.out.print("Round"+round);

            System.out.println(" \t Enter 0 for SCISSORS, Enter 1 for PAPER, Enter 2 for ROCK");
            int userNumber= sc.nextInt();

           if(userNumber == computerNumber){

               if(userNumber == 0 && computerNumber == 0){
                   System.out.println("computer: scissors \t user: scissors");

               }else if(userNumber == 1 && computerNumber == 1){
                   System.out.println("computer: paper \t user: paper");

               }else{
                   System.out.println("computer: rock \t user: rock");

               }

               System.out.println("Match tied");

           }else if(computerNumber == 0 && userNumber == 1){
               System.out.println("computer: scissors \t user: paper");
               System.out.println("Computer win");

               computerWins++;

           }else if (computerNumber == 0 && userNumber == 2){
               System.out.println("computer: scissors \t user: rock");
               System.out.println("User win");

               userWins++;

           }else if (computerNumber == 1 && userNumber == 2){
               System.out.println("computer: paper \t user: rock");
               System.out.println("Computer win");

               computerWins++;

           }else if(computerNumber == 1 && userNumber == 0){
               System.out.println("computer: paper \t user: scissors");
               System.out.println("User win");

               userWins++;

           }else if(computerNumber == 2 && userNumber == 0){
               System.out.println("computer: rock \t user: scissors");
               System.out.println("Computer win");

               computerWins++;

           }else if(computerNumber == 2 && userNumber == 1){
               System.out.println("computer: rock \t user: paper");
               System.out.println("User win");

               userWins++;

           }else {
               System.out.println("Out of rule Enter valid number");
               round--;
           }

            round++;

        }while (round<=5);

        if(computerWins == userWins){
            System.out.println("computer score"+computerWins+ " user score "+userWins+ " \t match tied");

        }  else if(computerWins > userWins){
            System.out.println("computer score"+computerWins+ " user score "+userWins+ "\t So computer won the match");

        }
           else{
            System.out.println("computer score"+computerWins+ " user score "+userWins+ "\t So user won the match");

        }
    }
}
