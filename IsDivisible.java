import java.util.Scanner;

public class IsDivisible {

    public static boolean isDivisible(int n, int m)
    {
        return m!=0 && n%m==0;
    }
    
    public static void main(String[] args)
    {
        int n,m;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        n = in.nextInt();
        m = in.nextInt();
        
        System.out.print(isDivisible(n,m));




    }
}