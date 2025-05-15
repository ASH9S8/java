import java.util.Scanner;

public class IsTriangle {

    public static boolean isTriangle(int a, int b, int c)
    {
        return (a>0 && b>0 && c>0 && a+b>c && a+c>b && b+c>a);
    }
    
    public static void main(String[] args)
    {
        int a,b,c;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter three sides: ");
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        
        System.out.println(isTriangle(a,b,c));
        
        if(isTriangle(a,b,c))
          System.out.println("can be a triangle");
        else
          System.out.println("cannot be a triangle");  
        
        
    }
}