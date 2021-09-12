import java.util.Scanner;

// Exercise from book pg. 145 number 2
public class Nr2
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        String firstName, middleName, lastName;

        System.out.println("Type in your first name: ");
        firstName = keyboard.nextLine();

        System.out.println("Type in your middle name: ");
        middleName = keyboard.nextLine();

        System.out.println("Type in your last name: ");
        lastName = keyboard.nextLine();

        char firstInitial = firstName.charAt(0);
        System.out.println("The initial of your first name: " + firstInitial);

        char middleInitial = middleName.charAt(0);
        System.out.println("The initial of your middle name: " + middleInitial);

        char lastInitial = lastName.charAt(0);
        System.out.println("The initial of your last name: " + lastInitial);

    }
}
