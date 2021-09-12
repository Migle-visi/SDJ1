import java.util.Scanner;

public class MyNameAndAge
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("What is your name? ");
        String name = keyboard.nextLine();

        System.out.println("What is your age? ");
        int age = keyboard.nextInt();

    }
}
