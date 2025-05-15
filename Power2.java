import java.util.Scanner;

public class Power2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the values x, n: ");
        double x = in.nextInt();
        int n = in.nextInt();    

        System.out.println(power(x,n));
    }

    public static double power(double x, int n) {
 
        double ans=1;

        for (int i=0;i<n;i++)
         ans=ans*x;
         
      return ans;   
    }     
        
}