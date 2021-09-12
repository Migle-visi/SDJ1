import java.util.Scanner;

public class play
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Input your age: ");
        int age = keyboard.nextInt();

        if (age >= 13)
        {
            System.out.println("You can ride.");
        }
        else
        {
            System.out.println("Nej.");
        }


    }



}
