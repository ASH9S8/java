import java.util.Scanner;

public class Ack {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the ackermann parameters m, n: ");
        int m = in.nextInt();
        int n = in.nextInt();    

        System.out.println(ack(m,n));
    }

    public static int ack(int m, int n) {
         if (m==0) {
            return n+1;
        } 

        else if(m>0 && n==0) {
            return ack(m-1,1);
        }

        else if(m>0 && n>0) {
            return ack(m-1, ack(m,n-1));
        }

        else {
            return 100;
        }
    }

}