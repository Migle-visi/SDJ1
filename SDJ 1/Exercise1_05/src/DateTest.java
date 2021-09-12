import rentalcompany.model.*;

// Program shows the date, number of days and years.

public class DateTest
{
    public static void main(String[] args)
    {
        MyDate birthday = new MyDate(9,8,1995);
        System.out.println("My birthday is on " + birthday);

        MyDate today = new MyDate(30,8,2021);
        int days = birthday.daysBetween(today);
        System.out.println("Days since I was born " + days);

        int years = birthday.yearsBetween(today);
        System.out.println("I have " + years + " apples");

    }
}
