import java.util.Scanner;

public class Facto {

    public static long facto(long num)
    {

        if (num==0) {
          return 1;
        } 

        else {
           return num*facto(num-1);
        
        }
          
    }

    public static void main(String[] args)
    {
        long num;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number: ");
        num = in.nextLong();
        System.out.print("Factorial of " + num + "is: " + facto(num));
    


    }
}
