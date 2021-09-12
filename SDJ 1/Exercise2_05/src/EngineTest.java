import rentalcompany.model.*;
import java.util.Scanner;

public class EngineTest
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the type of engine: ");
        String type = keyboard.nextLine();

        System.out.println("Enter the horse power of the car: ");
        int horsePower = keyboard.nextInt();

        System.out.println("Enter the volume of the engine: ");
        int volume = keyboard.nextInt();

        Engine engine = new Engine(type, horsePower, volume, false);
        boolean endsWith = type.endsWith("petrol"); // true statement if the car is petrol
        System.out.println("Is this a petrol car? " + endsWith);

        System.out.println("The summary of your car: " + engine.toString()); // prints all information of object engine

    }
}
