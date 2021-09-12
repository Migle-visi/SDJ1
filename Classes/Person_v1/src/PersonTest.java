import java.util.Scanner;

public class PersonTest
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("What is first persons name? ");
        String name = keyboard.nextLine();

        System.out.println("What is first persons age? ");
        int age = keyboard.nextInt();
        keyboard.nextLine();

        System.out.println("What is first persons gender? ");
        String line = keyboard.nextLine();
        char gender = line.charAt(0);

        Person per1 = new Person(name, age, gender);
        System.out.println(per1);

        per1.setName("Drake");
        per1.setAge(35);
        per1.setGender('M');

        System.out.println( name + "'s friend is: " + per1.getName() + " " + per1.getAge() + " " + per1.getGender());

        per1.setName("Josh");
        per1.setAge(23);
        per1.setGender('M');

        System.out.println( name + "'s bestie is: " + per1.getName() + " " + per1.getAge() + " " + per1.getGender());

    }
}
