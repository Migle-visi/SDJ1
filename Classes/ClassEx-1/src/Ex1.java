import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int number1;
        int number2;

        System.out.println("Pick an integer: ");
        number1 = keyboard.nextInt();
        keyboard.nextLine();

        System.out.println("Pick another integer: ");
        number2 = keyboard.nextInt();
        keyboard.nextLine();

        if (number1 >= 1)
            System.out.println("Numbers sorted out: " + number1 + "," + number2);
        else
            System.out.println("Numbers sorted out: " + number2 + "," + number1);

        int total;
        double div;
        int mod;

        div = number1 / number2;
        mod = number1 % number2;
        total = number1 + number2;
        System.out.println("The sum of your chosen numbers is: " + total);

        if (number2 > 0) {
            System.out.println("The division of your chosen numbers: " + div);
            System.out.println("The modulus of your chosen numbers is: " + mod);
        } else
            System.out.println("You cannot divide by zero.");

    }
}
