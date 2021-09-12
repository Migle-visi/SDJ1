import java.util.Scanner;

public class Switch
{
    public static void main(String[] args)
    {
        int userNum;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter one of the numbers - 1, 2 or 3: ");
        userNum = keyboard.nextInt();
        keyboard.nextLine();

        switch (userNum)
        {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            default:
                System.out.println("Try again. Enter a number that is 1, 2 or 3.");

        }
    }
}
