import java.util.Scanner;

public class StringCompareTo
{
    public static void main(String[] args)
    {
        String name1, name2;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter a name: ");
        name1 = keyboard.nextLine();

        System.out.println("Enter another name: ");
        name2 = keyboard.nextLine();

        // comparing the names

        if (name1.compareTo(name2) < 0)
        {
            System.out.println(name1 + " is less than " + name2);
        }
        else if (name1.compareTo(name2) == 0)
        {
            System.out.println(name1 + " is equal to " + name2);
        }
        else if (name1.compareTo(name2) > 0)
        {
            System.out.println(name1 + " is greater than " + name2);
        }

        if (name1.equals(name2))
        {
            System.out.println("Please type in two different names.");
        }
        else if (name1.equals("Alex") || name2.equals("Alex"))
        {
            System.out.println("Hey babe <3");
        }

    }
}
