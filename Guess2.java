import java.util.Scanner;
import java.util.Random;

public class Guess2 {



    
    public static void main(String[] args)
    {
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        guess(number);
    }
    
    
    public static void guess(int number)  {

        Scanner in = new Scanner(System.in);
        int inNum;


        System.out.println("I'm thinking of a number between 1 and 100 (including both). Can you guess what it is?");
        System.out.print("Type a number: ");

        inNum = in.nextInt();

        if(inNum == number) {
          System.out.println("CORRECT GUESS!!!!!!");
        }

        else {
          System.out.print("Input is too: ");
          
          if(inNum > number) { 
           System.out.println("high");
          }
          else if(inNum < number){
           System.out.println("low");
          }

          System.out.println("Try again: ");
          guess(number);


          
        }
    }
}