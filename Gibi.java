import java.util.Scanner;

public class Gibi {
    
    public static void main(String[] args)
    {
        
        double cel, far;
        Scanner in = new Scanner(System.in);

        System.out.print("How many celcius: ");
        cel = in.nextDouble();
        
        

        far = (cel*9/5) + 32;
        System.out.printf("%.1f C = %.1f F" , cel, far);

    }
}