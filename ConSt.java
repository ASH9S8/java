import java.util.Scanner;

public class ConSt {
    
    public static void main(String[] args)
    {
        int x;
        Scanner in = new Scanner(System.in);


        System.out.print("Enter a number: ");
        x = in.nextInt();

        if (x>0 && x<10)
         {
            System.out.println("positive single digit number.");
         }

        else
        {
            System.out.println("I don't care what the number is.");
        }


    }
}