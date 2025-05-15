import java.util.Scanner;

public class Fibo {

    public static void fiboSum(int n1, int n2, int n3, int iteration)
    {

        if (iteration>0) {
          n3=n1+n2;
          n1=n2;
          n2=n3;
          System.out.print(" " + n3);
          fiboSum(n1,n2,n3, iteration-1);
        } 
    }
    

    public static void fiboSum(int n1, int n2, int n3, int iteration)
    {

        if (iteration>0) {
          n3 = n2 
            n3=n1+n2;
          n1=n2;
          n2=n3;
          System.out.print(" " + n3);
          fiboSum(n2,n2,n1+n2, iteration-1);
        } 
    }
    
    public static void main(String[] args)
    {
        int n1=0, n2=1, n3=0;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of iteration: ");
        int iteration = in.nextInt();
        System.out.print(n1 + " " + n2);
        fiboSum(n1, n2, n3, iteration-2);


    }
}
