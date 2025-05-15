import java.util.Scanner;
import java.util.Random;

public class Guess {
    
    public static void main(String[] args)
    {
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        Scanner in = new Scanner(System.in);

        int inNum;

        System.out.println("I'm thinking of a number between 1 and 100 (including both). Can you guess what it is?");
        System.out.print("Type a number: ");

        inNum = in.nextInt();

        System.out.println("Your guess is:" + inNum);
        System.out.println("The number I was thinking of is: " + number);

        int re = number - inNum;

        System.out.print("You were off by: " + Math.abs(re));

       

    }
}