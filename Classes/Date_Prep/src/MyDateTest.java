import java.util.Scanner;

public class MyDateTest
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        int day, month, year;

        System.out.println("Day: ");
        day = keyboard.nextInt();
        keyboard.nextLine();

        System.out.println("Month: ");
        month = keyboard.nextInt();
        keyboard.nextLine();

        System.out.println("Year: ");
        year = keyboard.nextInt();
        keyboard.nextLine();

        MyDate dt1 = new MyDate(day, month, year);
        System.out.println("Your chosen date is: " + dt1.toString());

        dt1.set(12,10,2035);

        System.out.println("You will die on: " + dt1.toString());


    }
}
