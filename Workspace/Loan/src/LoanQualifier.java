import java.util.Scanner;

public class LoanQualifier
{
    public static void main(String[] args)
    {
        double salary;
        double yearsOnTheJob;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter your annual salary: ");
        salary= keyboard.nextDouble();

        System.out.println("Enter the number of years on your current job: ");
        yearsOnTheJob= keyboard.nextDouble();

        if (salary > 50000)
            if (yearsOnTheJob >= 2)
                System.out.println("You qualify for the loan!");
            else
                System.out.println("You must have worked for at least 2 years to qualify.");

        else
            System.out.println("You must earn at least $50,000 a year.");
    }
}
