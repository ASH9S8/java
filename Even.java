import java.util.Scanner;

public class Even{

    public static void main(String[] args)
    {
        long num;
        Scanner in = new Scanner(System.in);

        System.out.print("Hello this is odd/even checker, please enter your number: ");
        num = in.nextLong();

        if(num%2 == 0)
        
            System.out.printf("%d is an even number.", num);
    
        

        else
        
            System.out.printf("%d is odd number.", num);
        
    }

}
