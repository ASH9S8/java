import java.util.Scanner;

public class Rough {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number a: ");
        int a = in.nextInt();
        System.out.println("Enter your nearest guess: ");
        int x = in.nextInt();    

        System.out.println(squareRoot(a,x));
    }

    public static double squareRoot(int a, int x) 
    {
       int n=x, m=x, d=0;

       while(d>0.001)
       {
        m = n;
        n = ((m+a/m)/2);
        d = n - m;
       }

        
       return n;
    }

}