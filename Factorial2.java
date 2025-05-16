import java.util.Scanner;

public class Factorial2 {

    public static long facto(long num)
    {

    int ans=1;

    for(int i=1;i<=num;i++)
     ans=ans*i;

    return ans; 
          
    }

    public static void main(String[] args)
    {
        long num;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number: ");
        num = in.nextLong();
        System.out.print("Factorial of " + num + "  is: " + facto(num));
    


    }
}