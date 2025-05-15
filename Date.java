public class Date {
    
    public static void printAmi(int date, int year, String day, String month)
    {
        System.out.println(day + ", " + month + " " + date + ", " + year);
    }

    public static void printEuropa(int date, int year, String day, String month)
    {
        System.out.println(day + " " + date + " " + month + " " + year);
    }
    public static void main(String[] args)
    {
       

        String day = "Wednesday";
        String month = "May";
        int date = 7;
        int year = 2025;

        System.out.println("American format:");
        printAmi(date, year, day, month);
        System.out.println("European format");
        printEuropa(date, year, day, month);


    }
}
