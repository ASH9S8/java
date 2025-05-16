import java.util.Scanner;

public class Myexp {

    
    public static int facto(int n)
    {

    int ans=1;

    for(int i=1;i<=n;i++)
     ans=ans*i;

    return ans; 
          
    }

    /*public static double myexp(double x, int n)
    {
      int i =0 ;
      double temp = 0.0;
      for (int i=1;i<=n;i++) {
         temp = temp + ( Math.pow (x, i))/ factorial (i) ;
      }
      return temp;

    }*/



    public static double myexp(double x, int n)
    {
      double num = 1;
      double den =1;
      double temp = 0;
      for (int i=1;i<=n;i++) {
         temp = temp + (num / den) ;
         num = num*x;
         den = den*i;
      }
      return temp;

    }

    public static void check(double x, int n)
    {
      for (int i=1;i<=1;i++)
      {
        System.out.println(x + "\t" + Math.exp(x) + "\t" + myexp(x,n));
      }
    }





    public static void main(String[] args)
    {
      Scanner in = new Scanner(System.in);

      System.out.print("Enter the exponential power: ");
      double x = in.nextDouble();
      System.out.print("Enter the number of iterartion: ");
      int n = in.nextInt();
      System.out.println (myexp (x,n));
      check(x,n);

      System.out.println();

    for(double i=0.1;i<=100;i=i*10)
       {
        check(i,n);
       } 

    System.out.println();
     
    for(double i=-0.1;i>=-100;i=i*10)
       {
        System.out.println (myexp (i,n));
       } 
     
      

    }
}