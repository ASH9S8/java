import java.util.Scanner;

public class NumPattern {

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
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void pattern2(int rows)
    {
        int k=0;

         for(int i=1; i<=rows;i++)
        {
            for (int j=i;j<=i+k;j++)
            
            {
                System.out.print(j+ " ");
            
            }
            k=k+1;
            System.out.println();
        }
    }

    public static void pattern3(int rows) 
    {
        int k=0;

        for(int i=1; i<=rows;i++)
        {
            for (int j=rows;j>=i;j--)
            {
                System.out.print(" ");
            }

            for (int j=1;j<=i;j++)
            {
                System.out.print(k + " ");
                k=k+1;
            }

            System.out.println();
            

        }

    }


    public static void pattern4(int rows) 
    {
        int k=0;

        for(int i=1; i<=rows;i++)
        {

            for (int j=1;j<=i;j++)
            {
                System.out.print(k + " ");
                k=k+1;
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

        System.out.print("Select your patter: 1 or 2 or 3 or 4: ");
        pattern = in.nextInt();

        if(pattern == 1)
        pattern1(rows);
        
        else if(pattern == 2)
        pattern2(rows);

        else if(pattern == 3)
        pattern3(rows);

        else 
        pattern4(rows);


    }
}
