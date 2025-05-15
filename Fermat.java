import java.util.Scanner;

public class Fermat {

 public static void checkFermat(int a, int b, int c, int n) {

    rhs = Math.pow(a,n) + Math.pow(b,n)
    lhs = Math.pow(c,n)

    if ((n > 2) && (rhs == lhs)) {
      System.out.println("Holy smokes, Fermat was wrong!");
   } 
   else {
      System.out.println("No, that doesn't work.");
   }
 }

 public static void main(String[] args) {

    int a, b, c, n;
    Scanner in = new Scanner(System.in);

    System.out.print("Enter three numbers a, b and c: ");
    a = in.nextInt();
    b = in.nextInt();
    c = in.nextInt();
    System.out.print("Enter the exponential power:  ");
    n = in.nextInt();

    checkFermat(a, b, c, n);
 }
} 
