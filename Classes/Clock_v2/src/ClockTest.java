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

        Clock kl2 = new Clock(10800);
        System.out.println("Clock 1 is before clock 2? " + kl1.isBefore(kl2));
        System.out.println("Clock 2 is before clock 1? " + kl2.isBefore(kl1));

        System.out.println("Time from clock 1 to clock 2: " + kl1.timeTo(kl2));
        System.out.println("Time from clock 2 to clock 1: " + kl2.timeTo(kl1));
    }


}
