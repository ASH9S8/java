import java.util.Scanner;

public class Oddsum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter an odd number: ");
        int n = in.nextInt();  
        System.out.println(oddsum(n));
    }

    public static int oddsum(int n) {
        /*  if (n == 1) {
            return 1;
        } else {
            int recurse = oddsum(n - 2);
            int result = n + recurse;
            return result;
        } */
        return((n==1)?1:(n+oddsum(n-2)));
    }

}