import rentalcompany.model.*;
import java.util.Scanner;

public class DataTest
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int day, month, year;

        System.out.println("Enter the day: ");
        day = keyboard.nextInt();

        System.out.println("Enter the month: ");
        month = keyboard.nextInt();

        System.out.println("Enter the year: ");
        year = keyboard.nextInt();

        MyDate date = new MyDate(day, month, year); // allows me to use data from user input
        String date1 = date.toString();             // transforms date into a string type variable
        System.out.println("The full date is: " + date1);

        int days;   // creates new variable for a new question
        System.out.println("How many days do you want to go forward? ");
        days = keyboard.nextInt();      // allows us to use input from keyboard for selected variable

        date.stepForward(days);
        System.out.println("This is a new date: " + date.toString());


    }
}
