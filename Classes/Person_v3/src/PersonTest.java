public class PersonTest
{
    public static void main(String[] args)
    {
        String name;
        int age;
        char gender;

        Person per1 = new Person("Susan", 22, 'f');

        if (per1.getAge() <0)
        {
            System.out.println("Age cannot be less than 0");
        }

        else
        {
            System.out.println( per1.getName() + " is " + per1.getAgeStatus() + " and he/she is " + per1.getAge() + " years old.");
        }

        System.out.println("This person is a " + per1.getStatus());


    }
}
