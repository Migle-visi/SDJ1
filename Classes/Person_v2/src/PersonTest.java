import java.util.Scanner;

public class PersonTest
{
    public static void main(String[] args)
    {
        String name;
        int age;
        char gender;

        Person per1 = new Person("Peter", 66, 'M');

        if (per1.getAge() <0)
            System.out.println("Age cannot be less than 0");

        else
        System.out.println( per1.getName() + " is " + per1.getAgeStatus() + " and he is " + per1.getAge() + " years old.");


    }
}
