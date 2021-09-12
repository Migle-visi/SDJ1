import java.util.Scanner;

public class ClockTest
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        int hour, minute, second;

        System.out.println("Hour: ");
        hour = keyboard.nextInt();
        keyboard.nextLine();

        System.out.println("Minutes: ");
        minute = keyboard.nextInt();
        keyboard.nextLine();

        System.out.println("Seconds: ");
        second = keyboard.nextInt();
        keyboard.nextLine();

        Clock kl1 = new Clock(hour, minute, second);

        System.out.println("Your selected time is: " + kl1.getHour() + "h " + kl1.getMinute() + "mins "
                + kl1.getSecond() + "sec");
        System.out.println("Total amount of seconds is: " + kl1.getTimeInSeconds());
        System.out.println("The summary: " + kl1.toString());

        kl1.set(6,35,20);
        System.out.println("Your selected time is: " + kl1.getHour() + "h " + kl1.getMinute() + "mins "
                + kl1.getSecond() + "sec");
        System.out.println("Total amount of seconds is: " + kl1.getTimeInSeconds());
        System.out.println("The summary: " + kl1.toString());
    }


}
