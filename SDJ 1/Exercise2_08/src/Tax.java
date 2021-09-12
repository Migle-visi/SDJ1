import java.util.Scanner;

public class Tax
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        double item, tax, totalPrice;

        System.out.println("How much does your item cost? ");
        item = keyboard.nextDouble();

        tax = 1.25;
        totalPrice = item * tax;

        System.out.println("The tax is " + tax + " ,so the total price is "
                           + totalPrice);



    }
}
