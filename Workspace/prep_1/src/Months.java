import java.sql.SQLOutput;
import java.util.Scanner;

public class Months
{
    public static void main(String[] args)
    {
        int month, day, year;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter a number of a month: ");
        month = keyboard.nextInt();

        switch (month)
        {
            case 1:
                System.out.println("January ");
                break;
            case 2:
                System.out.println("February ");
                break;
            case 3:
                System.out.println("March ");
                break;
            case 4:
                System.out.println("April ");
                break;
            case 5:
                System.out.println("May ");
                break;
            case 6:
                System.out.println("June ");
                break;
            case 7:
                System.out.println("July ");
                break;
            case 8:
                System.out.println("August ");
                break;
            case 9:
                System.out.println("September ");
                break;
            case 10:
                System.out.println("October ");
                break;
            case 11:
                System.out.println("November ");
                break;
            case 12:
                System.out.println("December ");
                break;
            default:
                System.out.println("Invalid number. Try again.");
                break;

        }
        if (month > 12 || month < 1)
        {
            System.exit(0);
        }
        else
        {
            System.out.println("Input is correct, please continue. ");
        }

        System.out.println("Enter a day: ");
        day = keyboard.nextInt();

        if (day > 31 || day <0)

        {
            System.out.println("Invalid number. Try again.");
            System.exit(0);
        }
        else
        {
            System.out.println("Input is correct, please continue.");
        }

        System.out.println("Enter a year: ");
        year = keyboard.nextInt();
        keyboard.nextLine();

        System.out.println("Your chosen date is: " + day + " / " + month + " / " + year);

    }



}
