import java.util.Scanner;

public class NameTest
{
    public static void main(String[] args)
    {
        String firstName, lastName;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("What is your first name? ");
        firstName = keyboard.nextLine();

        System.out.println("What is your last name? ");
        lastName = keyboard.nextLine();

        Name name1 = new Name (firstName, lastName);
        System.out.println("Your full name is: " + name1.getFullName());
        System.out.println("Your formal name is: " + name1.getFormalName());

    }
}
