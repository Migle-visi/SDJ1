import java.util.Scanner;

public class RectangleTest
{
    public static void main(String[] args)
    {
        double length, width;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("What is the length? ");
        length = keyboard.nextDouble();

        System.out.println("What is the width? ");
        width = keyboard.nextDouble();

        Rectangle box = new Rectangle(length, width);

        System.out.println("The box's length is: " + box.getLength());
        System.out.println("The box's width is: " + box.getWidth());
        System.out.printf("The box's area is: " + "%.2f", box.getArea()); // getarea multiplies length with width

        // printf function with "%.2f" rounds up result to 2 decimal number

    }
}
