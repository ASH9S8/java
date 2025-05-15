public class Seconds {
    
    public static void main(String[] args)
    {
        double hour, minute, second;

        hour = 14;
        minute = 30;
        second = 40;

        double sDay = (hour * 3600 + minute * 60 + second);
        double eDay = (86400 - sDay);
        double ePercent = ((hour + (minute/60))/24);

        System.out.println("number of seconds since midnight: " + sDay);
        System.out.println("number of seconds until midnight: " + eDay);
        System.out.println("fraction of day that has passed: " + ePercent);

        double eHour = 12;
        double eMinute = 40;
        double eSecond = 34;

        double eTime = (eHour * 3600 + eMinute * 60 + eSecond);

        System.out.println("Elapsed time since start of Project: " + eTime + " seconds");

    }
}
