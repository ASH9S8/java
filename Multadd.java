import java.util.Scanner;

public class Multadd {

    public static double multadd(double a, double b, double c)
    {
        return a*b+c;
    }

    public static double expSum(double x)
    {
        return multadd(x, Math.exp(-x), Math.sqrt(1-Math.exp(-x)));
        
    }


    
    public static void main(String[] args)
    {
        double a,b,c;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter three numbers: ");
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();
        
        System.out.println(multadd(a,b,c));

        System.out.println(multadd(0.5, (Math.cos(Math.PI/4)), (Math.sin(Math.PI/4))));

        System.out.println(multadd(1,Math.log10(10.0),Math.log10(20.0)));

        System.out.println("Enter value of x ");
        double x = in.nextDouble();

        System.out.println(expSum(x));
        
       
        
    }
}