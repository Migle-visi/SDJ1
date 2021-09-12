import java.util.Scanner;

public class EmailTest
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        String user, host, domain;

        System.out.println("What is the user of email? ");
        user = keyboard.nextLine();

        System.out.println("What is your emails host? ");
        host = keyboard.nextLine();

        System.out.println("What is the domain of your email? ");
        domain = keyboard.nextLine();

        Email email = new Email (user, host, domain);
        System.out.println("Your full email is: " + email);
    }
}
