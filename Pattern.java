import java.util.Scanner;

public class Pattern {

    public static void pattern1(int rows) 
    {

        for(int i=1; i<=rows;i++)
        {
            for (int j=rows;j>=i;j--)
            {
                System.out.print(" ");
            }

            for (int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern2(int rows)
    {
         for(int i=1; i<=rows;i++)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    
    public static void main(String[] args)
    {
        int rows, pattern;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        rows = in.nextInt();

        System.out.print("Select your patter: 1 or 2: ");
        pattern = in.nextInt();

        if(pattern == 1)
         pattern1(rows);
        
        else
         pattern2(rows);


    }
}
