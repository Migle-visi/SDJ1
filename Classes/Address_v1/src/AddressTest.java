import java.util.Scanner;

public class AddressTest
{
    public static void main(String[] args)
    {
        String town, street, door;
        int number, floor;
        char letter;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("In what town do you live? ");
        town = keyboard.nextLine();

        System.out.println("What street do you live in? ");
        street = keyboard.nextLine();

        System.out.println("What is your streets number? ");
        number = keyboard.nextInt();

        System.out.println("Which floor do you live in? ");
        floor = keyboard.nextInt();

        keyboard.nextLine();

        System.out.println("Which is your door? ");
        door = keyboard.nextLine();

        System.out.println("What is the number of your door? ");
        String line = keyboard.nextLine();
        letter = line.charAt(0);

        Address address = new Address(town, street, number, letter, floor, door);
        System.out.println("Your full address is: " + address);


    }
}
