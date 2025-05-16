import java.util.Scanner;

public class Gauss
{
   public static double gauss(double x, int n)
   
   {
      double result = 0;
      double num = 1;
      double den = 1;
      int sign = 1;
      for (int i=1;i<n;i++)
      {
         result = result + (sign)*(num)/(den);
         sign = sign*(-1);
         num = num*x*x;
         den = den*i;
      }
      return result;
   }


   public static void main(String[] args)
   {
    Scanner in = new Scanner(System.in);

    System.out.print("Enter the exponential power: ");
    double x = in.nextDouble();
    System.out.print("Enter the number of iterartion: ");
    int n = in.nextInt();

    System.out.println(gauss(x,n));
    System.out.println(Math.exp(-(x*x)));
   }


}