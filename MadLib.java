import java.util.Scanner;

public class MadLib {
    
    public static void main(String[] args)
    {
        String location, verb, name;
        int speed;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a name: ");
        name = in.nextLine();
        System.out.print("Enter a place: ");
        location = in.nextLine();
        System.out.print("Enter a verb: ");
        verb = in.nextLine();
        System.out.print("enter a speed in kmph: ");
        speed = in.nextInt();

        System.out.println(name + " is in " + location + " " + verb + " at " + speed + " kmph");



    }
}
