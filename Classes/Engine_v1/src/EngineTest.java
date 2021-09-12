import java.util.Scanner;

public class EngineTest {
    public static void main(String[] args)
    {
        String type;
        int horsePower, volume;
        boolean isDiesel;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is the type of your engine? ");
        type = keyboard.nextLine();

        System.out.println("What is the horsepower of engine? ");
        horsePower = keyboard.nextInt();
        keyboard.nextLine();

        System.out.println("What is the volume of engine? ");
        volume = keyboard.nextInt();
        keyboard.nextLine();

        System.out.println("Is your engine a diesel engine? Answer true or false.");
        isDiesel = keyboard.nextBoolean();
        keyboard.nextLine();

        Engine eng1 = new Engine(type,horsePower,volume);
        System.out.println("The summary of your engine is: \n" + eng1.toString());

        Engine eng2 = new Engine(type, horsePower, volume, isDiesel);
        System.out.println("The summary of your engine is: \n" + eng2.toString());


    }
}
