import java.util.Scanner;

public class Power {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the values x, n: ");
        double x = in.nextInt();
        int n = in.nextInt();    

        System.out.println(power(x,n));
    }

    public static double power(double x, int n) {
         if (x == 0) {
            if(n==0){
                return 100.0;
            }
            else {
                return 0;
            }

         }

         else {

            if(n==1) {
                return x;
            }

            else if(n==2){
                return x*x;
            }

            else {
              if(n%2==0) {
                 return power(power(x,n/2),2);
                }

              else {
                return x*power(x,n-1);
                }
            }
         }
    }     

}
