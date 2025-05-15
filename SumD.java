import java.util.Scanner;
public class SumD{

    public static void main(String[] args)
    {
        int num, sum;
        sum = 0;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your number: ");
        num = in.nextInt();

        while(num!=0)
        {
            sum = sum + num%10;
            num = num/10;

        }

    System.out.print("Sum of digits is: " + sum);
    


    }

}