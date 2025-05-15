import java.util.Scanner;

public class Calc {
    
    public static void main(String[] args)
    {
        double a, b;
        char op;
        Scanner in = new Scanner(System.in);
        
        System.out.println("Hello, this is a calculator.");
        System.out.print("Please enter the first numbers: ");
        a = in.nextDouble();
        System.out.print("Please enter the second number: ");
        b = in.nextDouble();

        System.out.println("Please select your options: ");
        System.out.println("a. add");
        System.out.println("b. subtract");
        System.out.println("c. multiply");
        System.out.println("d. divide");

        op = in.next().charAt(0);

        if(op == 'a')
        {
            System.out.println("The addition of both numbers is: " + (a+b));
        }

        else if(op == 'b')
        {
            System.out.println("The subtraction of both numbers is: " + (a-b)); 
        }

        else if(op == 'c')
        {
            System.out.println("The multiplication of both numbers is: " + (a*b));
        }

        else if(op == 'd')
        {
            System.out.println("The division of both numbers is: " + (a/b));
        }

        else
        {
            System.out.println("Wrong option!");
        }

    }
}
