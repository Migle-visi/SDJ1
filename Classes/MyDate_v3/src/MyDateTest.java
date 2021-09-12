import java.util.Scanner;

public class MyDateTest
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter a day:");
        int day = keyboard.nextInt();
        keyboard.nextLine();

        System.out.println("Enter a month: ");
        int month = keyboard.nextInt();
        keyboard.nextLine();

        System.out.println("Enter a year: ");
        int year = keyboard.nextInt();
        keyboard.nextLine();

        MyDate myDate1 = new MyDate(day, month, year);

        System.out.println("Is it a leap year? " + myDate1.isLeapYear());
        System.out.println("Astro sign is: " + myDate1.getAstroSign());
        System.out.println("Astro element is: " + myDate1.getAstroElement());



    }
}
