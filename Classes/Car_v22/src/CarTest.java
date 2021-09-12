import java.util.Scanner;

public class CarTest
{
    public static void main(String[] args)
    {
        Engine engine;
        String colour, model,make;
        Boolean manualGear = true;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Where is car manufactured? ");
        make = keyboard.nextLine();

        System.out.println("What is the car's model? ");
        model = keyboard.nextLine();

        System.out.println("What is the car's color? ");
        colour = keyboard.nextLine();

        engine = new Engine ("slow", 4000, 500, true);

        Car newCar = new Car(make, model, manualGear, colour, engine);

        System.out.println("The summary of your car is: " + newCar.toString());
    }
}
