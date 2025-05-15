import java.util.Scanner;

public class BoB {

    public static void lyrics(int beerNum) {
      if (beerNum > 0) {
         System.out.println(beerNum + " bottles of beer on the wall,");
         System.out.println(beerNum + " bottles of beer,");
         System.out.println("ya' take one down, ya' pass it around,");
         System.out.println(--beerNum + " bottles of beer on the wall.");
         System.out.println();
         lyrics(beerNum);
      } 

      else {
         System.out.println("No bottles of beer on the wall,");
         System.out.println("no bottles of beer,");
         System.out.println("ya' can't take one down, ya' can't pass it around,");
         System.out.println("'cause there are no more bottles of beer on the wall!");
      }
    }

    public static void main(String[] args) {

        int beerNum;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of beer bottles: ");
        beerNum = in.nextInt();

        lyrics(beerNum);

    }
 


}