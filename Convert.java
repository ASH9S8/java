import java.util.Scanner;

public class Convert {
    
    public static void main(String[] args)
    {
        int iSec, hour, min, fSec;
        Scanner in = new Scanner(System.in);

        System.out.print("How many seconds?: ");
        iSec = in.nextInt();

        fSec = iSec%60;
        hour = iSec/60;
        min = hour%60;
        hour = hour/60;

        System.out.printf("%d seconds = %d hour, %d minutes and %d seconds\n",iSec, hour, min, fSec);


    }
}