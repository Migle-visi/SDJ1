import java.util.Scanner;

public class MyPersonalData
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("What is your name? ");
        String name = keyboard.nextLine();

        System.out.println("What is your age? ");
        int age = keyboard.nextInt();       // acts as \n
        keyboard.nextLine();                // consumes the line and allows to go to next line

        System.out.println("What is your address? ");
        String address = keyboard.nextLine();

    }
}
