import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int int1, int2, int3;

        System.out.println("Pick first integer: ");
        int1 = keyboard.nextInt();
        keyboard.nextLine();

        System.out.println("Pick second integer: ");
        int2 = keyboard.nextInt();
        keyboard.nextLine();

        System.out.println("Pick third integer:");
        int3 = keyboard.nextInt();
        keyboard.nextLine();

        if (int1 > int2 && int3 > int2)
            System.out.println("Integers sorted out: " + int1 + ", " + int2 + ", " + int3);
        else
            System.out.println("Integers sorted out: " + int2 + ", " + int2);


    }

}
